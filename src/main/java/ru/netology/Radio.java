package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int stationAmount = 10;
    private int station;
    private int volume;

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > stationAmount - 1) {
            return;
        }
        this.station = station;
    }

    public void setNextStation() {
        if (station < stationAmount - 1) {
            station++;
        }
        else {
            station = 0;
        }
    }

    public void setPreviousStation() {
        if (station > 0) {
            station--;
        }
        else station = stationAmount - 1;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
