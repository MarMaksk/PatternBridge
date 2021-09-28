package com.company.cars;

public interface Car {
    void startEngine();

    void endEngine();

    void openDoor();

    void closeDoor();

    void turnLight(int brightness);

    int getLightBrightness();
}
