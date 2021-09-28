package com.company;

public class SportCar extends CarsLogic {
    @Override
    public void startEngine() {
        System.out.println("BRRRR");
    }

    @Override
    public void endEngine() {
        System.out.println("Ts...");
    }

    @Override
    public void openDoor() {
        System.out.println("Sssssss");
    }

    @Override
    public void closeDoor() {
        System.out.println("ssssss");
    }
}
