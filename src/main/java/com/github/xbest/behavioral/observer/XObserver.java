package com.github.xbest.behavioral.observer;

import java.util.Objects;

/**
 * Created by link on 2017/3/4.
 */
public class XObserver implements Observer {
    @Override
    public void update(Observable observable, Object arg) {
        System.out.printf("I'am X Observer. I have received the update message. The arg is %s.%n",
                Objects.isNull(arg) ? null : arg.toString());
    }
}
