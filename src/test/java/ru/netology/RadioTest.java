package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldUseDefaultConstructor() {
        int expected = 10;

        assertEquals(expected, radio.getStationAmount());
    }

    @Test
    void shouldUseRandomConstructor() {
        Radio radio = new Radio(12);
        int expected = 12;

        assertEquals(expected, radio.getStationAmount());
    }

    @Test
    void shouldSetStationInRange() {
        int expected = 8;

        radio.setStation(8);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetStationAboveRange() {
        int expected = 0;

        radio.setStation(10);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetStationUnderRange() {
        int expected = 0;

        radio.setStation(-5);

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetNextStationInRange() {
        int expected = 1;

        radio.setNextStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetNextStationAboveRange() {
        int expected = 0;
        radio.setStation(radio.getStationAmount() - 1);

        radio.setNextStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetPreviousStationInRange() {
        int expected = 6;
        radio.setStation(7);

        radio.setPreviousStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetPreviousStationUnderRange() {
        int expected = radio.getStationAmount() - 1;

        radio.setPreviousStation();

        assertEquals(expected, radio.getStation());
    }

    @Test
    void shouldSetVolumeInRange() {
        int expected = 50;

        radio.setVolume(50);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeAboveRange() {
        int expected = 0;

        radio.setVolume(110);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeUnderRange() {
        int expected = 0;

        radio.setVolume(-15);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeInRange() {
        int expected = 1;

        radio.increaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveRange() {
        int expected = 100;
        radio.setVolume(100);

        radio.increaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeInRange() {
        int expected = 9;
        radio.setVolume(10);

        radio.decreaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeUnderRange() {
        int expected = 0;

        radio.decreaseVolume();

        assertEquals(expected, radio.getVolume());
    }
}