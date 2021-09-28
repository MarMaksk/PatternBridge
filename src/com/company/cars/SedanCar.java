package com.company.cars;

public class SedanCar extends CarsLogic {

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
}
