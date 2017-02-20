package com.github.xbest.creational.factorymethod;

/**
 * Created by link on 2017/2/20.
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
