package com.github.xbest.creational.factorymethod.car;

/**
 * Created by link on 2017/2/21.
 */
public class BugattiCar extends Car{
    public BugattiCar() {
        this("BugattiEngine", "BugattiTire", "BugattiFrame", "BugattiWindow");
    }

    public BugattiCar(String engine, String tire, String frame, String window) {
        this.engine = engine;
        this.tire = tire;
        this.frame = frame;
        this.window = window;
    }

    @Override
    public String toString() {
        return "BugattiCar{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", frame='" + frame + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
