package com.github.xbest.behavioral.observer;

/**
 * Created by link on 2017/3/4.
 */
public class UpdateArg {
    private String id;
    private String message;

    public UpdateArg(String id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "UpdateArg{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
