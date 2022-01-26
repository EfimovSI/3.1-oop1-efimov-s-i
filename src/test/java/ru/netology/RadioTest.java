package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldUseDefaultConstructor() {
        Radio radio = new Radio();
        int expected = 9;

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldUseRandomConstructor() {
        Radio radio = new Radio(12);
        int expected = 12;

        assertEquals(expected, radio.getStationAmount());
    }

    @Test
    void shouldSetStationInRange() {
        Radio radio = new Radio();
        int expected = 8;

        radio.setStation(8);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetStationAboveRange() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setStation(10);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetStationUnderRange() {
        Radio radio = new Radio();
        int expected = 0;

        radio.setStation(-5);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetNextStationInRange() {
        Radio radio = new Radio();
        int expected = 1;

        radio.setNextStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetNextStationAboveRange() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setStation(radio.getStationAmount() - 1);

        radio.setNextStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetPreviousStationInRange() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setStation(7);

        radio.setPreviousStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetPreviousStationUnderRange() {
        Radio radio = new Radio();
        int expected = radio.getStationAmount() - 1;

        radio.setPreviousStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldIncreaseVolumeInRange() {
        Radio radio = new Radio();
        int expected = 1;

        radio.increaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveRange() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeInRange() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setVolume(10);

        radio.decreaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderRange() {
        Radio radio = new Radio();
        int expected = 0;

        radio.decreaseVolume();

        assertEquals(expected, radio.getVolume());
    }
}