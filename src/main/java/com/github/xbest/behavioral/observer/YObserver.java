package com.github.xbest.behavioral.observer;

import java.util.Objects;

/**
 * Created by link on 2017/3/4.
 */
public class YObserver implements Observer {
    @Override
    public void update(Observable observable, Object arg) {
        System.out.printf("I'am Y Observer. I have received the update message. The arg is %s.%n",
                Objects.isNull(arg) ? null : arg.toString());
    }
}
