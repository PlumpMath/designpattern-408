package com.github.xbest.structural.bridge;

/**
 * Created by link on 2017/2/27.
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "<URGENCY> "+message;
        super.sendMessage(message, toUser);
    }
}
