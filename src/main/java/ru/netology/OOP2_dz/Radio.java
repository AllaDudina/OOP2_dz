package ru.netology.OOP2_dz;

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int currentStations;

    public int getCurrentStations() {
        return currentStations;
    }
    public void setCurrentStations(int newCurrentStations) {
        if (newCurrentStations > 9) {
            newCurrentStations = 0;
        }
        if (newCurrentStations < 0) {
            newCurrentStations = 9;
        }
        currentStations = newCurrentStations;
    }
    public void nextStations() {
        if (currentStations < 9) {
            currentStations = currentStations + 1;
        }
        if ((currentStations + 1) > 9) {
            currentStations = 0;
        }
    }

    public void prevStations() {
        if (currentStations > 0) {
            currentStations = currentStations - 1;
        }
        if ((currentStations - 1) < 0) {
            currentStations = 9;
        }
    }
}
