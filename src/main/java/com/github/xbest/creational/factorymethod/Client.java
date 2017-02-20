package com.github.xbest.creational.factorymethod;

/**
 * Created by link on 2017/2/20.
 */
public class Client {
    public static void main(String[] args) {
        Shape shape;
        ShapeFactory shapeFactory;

        shapeFactory = new SquareFactory();
        shape = shapeFactory.createShape();
        shape.draw();

        shapeFactory = new CircleFactory();
        shape = shapeFactory.createShape();
        shape.draw();
    }
}
