package com.github.xbest.creational.factorymethod.car;

/**
 * Created by link on 2017/2/21.
 */
public class BugattiCarFactory implements CarFactory {
    @Override
    public Car assembleCar() {
        Car car = new BugattiCar();
        car.setEngine("Bugatti engine");
        car.setFrame("Bugatti frame");
        car.setTire("Bugatti tire");
        car.setWindow("Bugatti window");
        return car;
    }
}
