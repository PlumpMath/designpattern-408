package com.github.xbest.structural.bridge;

/**
 * Created by link on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMessage message;
        MessageSender messageSender;

        messageSender = new MessageSenderSMS();
        message = new CommonMessage(messageSender);
        message.sendMessage("hi, there.", "jamesbond");
        message = new UrgencyMessage(messageSender);
        message.sendMessage("hi, there.", "jamesbond");

        messageSender = new MessageSenderEmail();
        message = new CommonMessage(messageSender);
        message.sendMessage("hi, there.", "jamesbond");
        message = new UrgencyMessage(messageSender);
        message.sendMessage("hi, there.", "jamesbond");

    }
}
