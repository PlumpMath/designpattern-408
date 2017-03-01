package com.github.xbest.structural.flyweight;

/**
 * 享元模式，分为内部状态和外部状态，内部状态为共享状态，外部状态由客户端来维护。<br/>
 * 该模式主要用于重复生成内部状态相同的很多对象，减少对象个数，节省内存。<br/>
 * 实现时要注意线程安全，避免同一name生成多个对象。<br/>
 * jdk中的典型案例为{@link Integer#valueOf(int)}<br/>
 * Created by link on 2017/2/28.
 */
public interface FlyWeight {
    void action(String external);
}
