package com.github.xbest.creational.factorymethod;

/**
 * Created by link on 2017/2/20.
 */
public class CircleFactory implements ShapeFactory {
    public Shape createShape() {
        return new Circle();
    }
}
