package com.github.xbest.creational.factorymethod.car;

/**
 * Created by link on 2017/2/21.
 */
public class BenzCar extends Car {
    public BenzCar() {
        this("BenzEngine", "BenzTire", "BenzFrame", "BenzWindow");
    }

    public BenzCar(String engine, String tire, String frame, String window) {
        this.engine = engine;
        this.tire = tire;
        this.frame = frame;
        this.window = window;
    }

    @Override
    public String toString() {
        return "BenzCar{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", frame='" + frame + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
