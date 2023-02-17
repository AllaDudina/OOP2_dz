package ru.netology.OOP2_dz;

public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStations = 0;
    private  int maxStations = 9;
    private int currentStations = minStations;

    public  Radio (int minVolume, int maxVolume, int minStations, int maxStations) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
        this.minStations = minStations;
        this.maxStations = maxStations;
        this.currentStations=minStations;

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
            currentStations --;
        if (currentStations <= minStations) {
            currentStations = maxStations;
        }
    }
}
