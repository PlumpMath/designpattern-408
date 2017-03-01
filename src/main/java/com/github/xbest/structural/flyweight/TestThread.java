package com.github.xbest.structural.flyweight;

/**
 * Created by link on 2017/3/1.
 */
public class TestThread implements Runnable {
    private String flyWeightName;

    public TestThread(String flyWeightName) {
        this.flyWeightName = flyWeightName;
    }

    @Override
    public void run() {
        while (true) {
            FlyWeight flyWeight = FlyWeightFactory.getFlyWeight(flyWeightName);
            String threadName = Thread.currentThread().getName();
            System.out.printf("Thread Name: %s, FlyWeightName: %s, FlyWeightHashCode: %s.%n",
                    threadName, flyWeightName, flyWeight.hashCode());
            flyWeight.action(threadName);
        }

    }
}
