package ru.netology;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void setNextStation() {
        if (station < 9) {
            station++;
        }
        else station = 0;
    }

    public void setPreviousStation() {
        if (station > 0) {
            station--;
        }
        else station = 9;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
