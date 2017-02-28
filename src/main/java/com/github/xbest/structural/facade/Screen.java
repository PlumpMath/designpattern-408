package com.github.xbest.structural.facade;

/**
 * Created by link on 2017/2/28.
 */
public class Screen implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("Turn on the screen...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the screen...");
    }
}
