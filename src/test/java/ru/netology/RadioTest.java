package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

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
        radio.setStation(9);

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
        int expected = 9;

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
        int expected = 10;
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        // Поступил таким образом, поскольку сеттер для звука в условиях задачи не значится,
        // (к тому же, сеттер потребует дополнительных тестов для покрытия branch'а),
        // а использование цикла в тесте потребует тестировать такой тест

        radio.increaseVolume();

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeInRange() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseVolume();
        radio.increaseVolume();

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