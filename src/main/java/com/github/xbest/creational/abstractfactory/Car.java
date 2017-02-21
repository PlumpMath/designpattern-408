package com.github.xbest.creational.abstractfactory;

/**
 * Created by link on 2017/2/21.
 */
public abstract class Car {
    protected String engine;
    protected String tire;
    protected String frame;
    protected String window;
    protected AssembleFactory assembleFactory;

    protected abstract void assemble();

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", frame='" + frame + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
