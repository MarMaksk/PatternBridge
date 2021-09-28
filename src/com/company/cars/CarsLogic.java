package com.company.cars;

public abstract class CarsLogic implements Car {
    private int lightBrightness = 0;

    @Override
    public void turnLight(int brightness) {
        if (brightness < 0)
            lightBrightness = 0;
        else if (brightness > 100)
            lightBrightness = 100;
        else
            lightBrightness = brightness;
        System.out.println("Light on. Brightness: " + lightBrightness);
    }

    public int getLightBrightness() {
        return lightBrightness;
    }
}
