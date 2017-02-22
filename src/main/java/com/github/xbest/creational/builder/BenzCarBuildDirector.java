package com.github.xbest.creational.builder;

/**
 * Created by link on 2017/2/22.
 */
public class BenzCarBuildDirector {
    private CarBuilder carBuilder;

    public BenzCarBuildDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        return carBuilder.setEngine("Benz engine").setFrame("Benz frame").setTire("Benz tire").setWindow("Benz window").build();
    }
}
