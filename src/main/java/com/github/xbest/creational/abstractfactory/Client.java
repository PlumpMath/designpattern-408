package com.github.xbest.creational.abstractfactory;

import com.github.xbest.creational.factorymethod.car.BugattiCarFactory;

/**
 * Created by link on 2017/2/21.
 */
public class Client {
    public static void main(String[] args) {
        Car car;
        AssembleFactory assembleFactory;

        assembleFactory = new BenzAssembleFactory();
        car = new BenzCar(assembleFactory);
        System.out.println(car.toString());

        assembleFactory = new BugattiAssembleFactory();
        car = new BugattiCar(assembleFactory);
        System.out.println(car.toString());
    }
}
