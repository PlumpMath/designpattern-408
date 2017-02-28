package com.github.xbest.structural.facade;

/**
 * Created by link on 2017/2/28.
 */
public class Light implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("Turn on the lights...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the lights...");
    }
}
