package com.github.xbest.creational.factorymethod.car;

/**
 * Created by link on 2017/2/21.
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car assembleCar() {
        Car car = new BenzCar();
        car.setEngine("Benz engine");
        car.setFrame("Benz frame");
        car.setTire("Benz tire");
        car.setWindow("Benz window");
        return car;
    }
}
