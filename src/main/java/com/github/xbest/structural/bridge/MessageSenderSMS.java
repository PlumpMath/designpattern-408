package com.github.xbest.structural.bridge;

/**
 * Created by link on 2017/2/27.
 */
public class MessageSenderSMS implements MessageSender {
    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("send message [%s] to user [%s] via SMS.", message, toUser));
    }
}
