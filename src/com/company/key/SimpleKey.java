package com.company.key;

import com.company.cars.Car;

public class SimpleKey extends KeysLogic {

    public SimpleKey(Car car) {
        super(car);
    }

    @Override
    public void startEngine() {
        System.out.println("squeak");
        getCar().startEngine();
    }

    @Override
    public void endEngine() {
        System.out.println("squeak");
        getCar().endEngine();
    }

    @Override
    public void openDoor() {
        System.out.println("squeak");
        getCar().openDoor();
    }

    @Override
    public void closeDoor() {
        System.out.println("squeak");
        getCar().closeDoor();
    }

    @Override
    public void turnLight(int brightness) {
        System.out.println("squeak");
        if (getCar().getLightBrightness() == 0)
            getCar().turnLight(100);
        else
            getCar().turnLight(0);
    }
}
