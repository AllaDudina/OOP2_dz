package ru.netology.OOP2_dz.RadioTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.OOP2_dz.Radio;

import java.awt.image.Raster;


public class RadioTest {
    Radio radio = new Radio();
    Radio radioStations = new Radio(10);

    @Test

    public void shouldNoSetVolumeAboveMAx() {

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNoSetVolumeBelowMin() {

        radio.setCurrentVolume(-4);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseIfMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldReduceIfMinVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldReduceVolume() {

        radio.setCurrentVolume(100);
        radio.reduceVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void shouldSetStations() {
        radioStations.setStations();
        Assertions.assertEquals(10, radioStations.getStations());
    }

    @Test
    public void shouldSetMaxStations() {
        radioStations.setMaxStations(15);

        Assertions.assertEquals(14, radioStations.getMaxStations());
    }

    @Test

    public void shouldTestCurrentStations() {

        radio.setCurrentStations(3);

        Assertions.assertEquals(3, radio.getCurrentStations());

    }

    @Test
    public void shouldNoSetStationsAboveMAx() {
        radio.setCurrentStations(10);
        Assertions.assertEquals(0, radio.getCurrentStations());

    }

    @Test
    public void shouldNoSetStationsBelowMin() {
        radio.setCurrentStations(-4);

        Assertions.assertEquals(9, radio.getCurrentStations());

    }

    @Test
    public void shouldNextIfMaxStations() {
        radio.setCurrentStations(9);
        radio.nextStations();

        Assertions.assertEquals(0, radio.getCurrentStations());
    }

    @Test
    public void shouldNextStations() {
        radio.setCurrentStations(3);
        radio.nextStations();

        Assertions.assertEquals(4, radio.getCurrentStations());

    }

    @Test
    public void shouldPrevIfMinStations() {

        radio.setCurrentStations(0);
        radio.prevStations();

        Assertions.assertEquals(9, radio.getCurrentStations());

    }

    @Test
    public void shouldPrevStations() {
        radio.setCurrentStations(6);
        radio.prevStations();

        Assertions.assertEquals(5, radio.getCurrentStations());

    }
}