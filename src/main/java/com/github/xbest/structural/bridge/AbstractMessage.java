package com.github.xbest.structural.bridge;

/**
 * 桥接模式，将抽象部分与它的实现部分相分离，使每个部分都可以独立变化，而不受其它部分影响。<br/>
 * 桥接模式使用了组合和继承来完成。个人觉得是由对象适配器模式演变而来，将多个adaptee实现统一接口，<br/>
 * 根据依赖注入和父类来委托子类去真正实现相应功能。<br/>
 * Created by link on 2017/2/27.
 */
public abstract class AbstractMessage {
    protected MessageSender messageSender;

    public AbstractMessage(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String message, String toUser) {
        messageSender.send(message, toUser);
    }
}
