package ru.netology.OOP2_dz.RadioTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.OOP2_dz.Radio;

public class RadioTest {

    @Test

    public void shouldTestVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeAboveMAx() {
        Radio volume = new Radio();

        volume.setCurrentVolume(12);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-4);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(8);
        volume.increaseVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(3);
        volume.reduceVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTestStations() {
        Radio stations = new Radio();

        stations.setCurrentStations(9);

        int expected = 9;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetStationsAboveMAx() {
        Radio stations = new Radio();

        stations.setCurrentStations(12);

        int expected = 0;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetStationsBelowMin() {
        Radio stations = new Radio();

        stations.setCurrentStations(-4);

        int expected = 9;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStations() {
        Radio stations = new Radio();

        stations.setCurrentStations(9);
        stations.nextStations();

        int expected = 0;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStations() {
        Radio stations = new Radio();

        stations.setCurrentStations(3);
        stations.nextStations();

        int expected = 4;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStations() {
        Radio stations = new Radio();

        stations.setCurrentStations(0);
        stations.prevStations();

        int expected = 9;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStations() {
        Radio stations = new Radio();

        stations.setCurrentStations(6);
        stations.prevStations();

        int expected = 5;
        int actual = stations.getCurrentStations();

        Assertions.assertEquals(expected, actual);
    }
}
