package com.github.xbest.behavioral.mediator;

/**
 * Created by link on 2017/3/3.
 */
public interface User {
    void sendMessage(String message);

    void receiveMessage(String message);

    String getMessage();
}
