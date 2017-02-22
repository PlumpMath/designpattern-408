package com.github.xbest.creational.builder;

/**创建者模式关注的主要是build顺序，即不同的build顺序会产生不同的效果。<br />
 * 工厂方法模式关注的主要是产生整个对象，并不关心内部零件装配顺序。
 * 目前不太清楚jdk中的builder pattern的应用案例，例如StringBuilder之类的感觉都不是应用了创建者模式。
 * Created by link on 2017/2/22.
 */
public interface CarBuilder {
    CarBuilder setEngine(String engine);
    CarBuilder setTire(String tire);
    CarBuilder setFrame(String frame);
    CarBuilder setWindow(String window);
    Car build();
}
