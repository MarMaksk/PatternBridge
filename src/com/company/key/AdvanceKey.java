package com.company.key;

import com.company.cars.Car;

public class AdvanceKey extends KeysLogic {
    public AdvanceKey(Car car) {
        super(car);
    }

    @Override
    public void startEngine() {
        getCar().startEngine();
    }

    @Override
    public void endEngine() {
        getCar().endEngine();
    }

    @Override
    public void openDoor() {
        getCar().openDoor();
    }

    @Override
    public void closeDoor() {
        getCar().closeDoor();
    }

    @Override
    public void turnLight(int brightness) {
        getCar().turnLight(brightness);
    }

    public void turnLight() {
        if (getCar().getLightBrightness() == 0)
            getCar().turnLight(100);
        else
            getCar().turnLight(0);
    }
}
