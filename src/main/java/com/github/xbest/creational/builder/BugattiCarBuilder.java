package com.github.xbest.creational.builder;

/**
 * Created by link on 2017/2/22.
 */
public class BugattiCarBuilder implements CarBuilder {
    private Car car;

    public BugattiCarBuilder() {
        car = new Car();
    }


    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setTire(String tire) {
        car.setTire(tire);
        return this;
    }

    @Override
    public CarBuilder setFrame(String frame) {
        car.setFrame(frame);
        return this;
    }

    @Override
    public CarBuilder setWindow(String window) {
        car.setWindow(window);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
