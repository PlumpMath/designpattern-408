package com.github.xbest.creational.builder;

/**
 * Created by link on 2017/2/22.
 */
public class BugattiCarBuildDirector {
    private CarBuilder carBuilder;

    public BugattiCarBuildDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car construct() {
        return carBuilder.setFrame("Bugatti frame").setEngine("Bugatti engine").setTire("Bugatti tire").setWindow("Bugatti window").build();
    }
}
