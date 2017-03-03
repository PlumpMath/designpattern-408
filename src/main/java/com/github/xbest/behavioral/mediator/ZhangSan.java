package com.github.xbest.behavioral.mediator;

/**
 * Created by link on 2017/3/3.
 */
public class ZhangSan extends AbstractUser {
    public ZhangSan(String name, Mediator mediator) {
        super(name, mediator);
    }

    public ZhangSan(Mediator mediator) {
        this("ZhangSan", mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("I'am ZhangSan. I have received a message [%s].%n", message);
    }
}
