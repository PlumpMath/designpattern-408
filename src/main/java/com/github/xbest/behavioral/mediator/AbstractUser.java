package com.github.xbest.behavioral.mediator;

/**
 * Created by link on 2017/3/3.
 */
public abstract class AbstractUser implements User {
    protected String name;
    protected String message;
    protected Mediator mediator;

    public AbstractUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.register(this);
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.printf("%s said [%s].%n", this.name, this.message);
        this.mediator.notifyAllMessage(this);
    }


    @Override
    public String getMessage() {
        return this.message;
    }
}
