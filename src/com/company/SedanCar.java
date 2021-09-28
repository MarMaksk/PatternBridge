package com.company;

public class SedanCar implements Car {
    private int lightBrightness = 0;

    @Override
    public void startEngine() {
        System.out.println("Trrrr");
    }

    @Override
    public void endEngine() {
        System.out.println("Pshhh");
    }

    @Override
    public void openDoor() {
        System.out.println("Bom");
    }

    @Override
    public void closeDoor() {
        System.out.println("Slap");
    }

    @Override
    public void turnLight(int brightness) {
        if (brightness < 0)
            lightBrightness = 0;
        else if (brightness > 100)
            lightBrightness = 100;
        else
            lightBrightness = brightness;
        System.out.println("Light on. Brightness: " + brightness);
    }
}
