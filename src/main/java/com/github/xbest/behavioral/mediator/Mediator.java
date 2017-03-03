package com.github.xbest.behavioral.mediator;

/**
 * 中介者模式，功如其名，就是充当中介，来协调多个对象之间的调用关系。<br/>
 * 本次实现的代码有点类似消息订阅发布的模式的聊天室，各个消息对象之间的通信通过中介者来实现。<br/>
 * 中介者模式应用不是很广泛，平时也较为少见，因为会牵扯到多个对象的关系，使得中介者本身的逻辑较为复杂。<br/>
 * Created by link on 2017/3/3.
 */
public interface Mediator {
    /**
     * 注册用户信息
     *
     * @param user
     */
    void register(User user);

    /**
     * 发送消息给所有注册用户
     *
     * @param user 发送消息者
     */
    void notifyAllMessage(User user);
}
