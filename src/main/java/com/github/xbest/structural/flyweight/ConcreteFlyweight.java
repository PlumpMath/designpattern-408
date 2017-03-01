package com.github.xbest.structural.flyweight;

/**
 * Created by link on 2017/2/28.
 */
public class ConcreteFlyweight implements FlyWeight {
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void action(String external) {
        System.out.printf("%s's external state is %s.%n", name, external);

    }
}
