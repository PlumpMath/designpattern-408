package com.github.xbest.creational.factorymethod.car;

/**
 * Created by link on 2017/2/21.
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory;
        Car car;

        carFactory = new BenzCarFactory();
        car = carFactory.assembleCar();
        System.out.println(car.toString());

        carFactory = new BugattiCarFactory();
        car = carFactory.assembleCar();
        System.out.println(car.toString());
    }
}
