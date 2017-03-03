package com.github.xbest.behavioral.mediator;

/**
 * Created by link on 2017/3/3.
 */
public class LiSi extends AbstractUser {
    public LiSi(String name, Mediator mediator) {
        super(name, mediator);
    }

    public LiSi(Mediator mediator) {
        this("LiSi", mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("I'am LiSi. I have received a message [%s].%n", message);
    }
}
