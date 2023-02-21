package ru.netology.OOP2_dz;

public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int stations = 10;
    private int minStations = 0;
    private int maxStations = stations - 1;
    private int currentStations = minStations;


    public Radio() {
    }

    public Radio(int stations) {
        this.stations = stations;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentStations() {
        return currentStations;
    }

    public int getStations() {
        return stations;
    }

    public void setMaxStations(int stations) {
        maxStations = stations - 1;

    }

    public int getMaxStations() {
        return maxStations;
    }

    public int setStations() {
        return stations;
    }


    public void setCurrentStations(int newCurrentStations) {
        if (newCurrentStations > maxStations) {
            newCurrentStations = minStations;
        }
        if (newCurrentStations < minStations) {
            newCurrentStations = maxStations;
        }
        currentStations = newCurrentStations;
    }

    public void nextStations() {
        currentStations++;
        if (currentStations > maxStations) {
            currentStations = minStations;
        }
    }

    public void prevStations() {
        currentStations--;
        if (currentStations <= minStations) {
            currentStations = maxStations;
        }
    }
}

