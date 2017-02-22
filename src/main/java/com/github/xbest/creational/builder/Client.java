package com.github.xbest.creational.builder;

/**
 * Created by link on 2017/2/22.
 */
public class Client {
    public static void main(String[] args) {
        Car car;
        CarBuilder carBuilder;

        carBuilder = new BenzCarBuilder();
        // 我们可以再引用一个director类类封装此处的build过程
        car = carBuilder.setEngine("Benz engine").setFrame("Benz frame").setTire("Benz tire").setWindow("Benz window").build();
        System.out.println(car.toString());

        // 引入CarBuildDirector类
        BenzCarBuildDirector benzCarBuildDirector = new BenzCarBuildDirector(carBuilder);
        car = benzCarBuildDirector.construct();
        System.out.println(car.toString());

        carBuilder = new BugattiCarBuilder();
        BugattiCarBuildDirector bugattiCarBuildDirector = new BugattiCarBuildDirector(carBuilder);
        car = bugattiCarBuildDirector.construct();
        System.out.println(car.toString());
    }
}
