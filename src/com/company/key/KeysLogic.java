package com.company.key;

import com.company.cars.Car;
import com.company.key.Key;

public abstract class KeysLogic implements Key {
    private Car car;

    public KeysLogic(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
