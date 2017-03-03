package com.github.xbest.behavioral.mediator;

/**
 * Created by link on 2017/3/3.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        User zhangSan = new ZhangSan(mediator);
        User liSi = new LiSi(mediator);
        zhangSan.sendMessage("Hi, buddy. I'am Zhangsan.");
        liSi.sendMessage("Hello, everyone. This is LiSi speaking.");
    }
}
