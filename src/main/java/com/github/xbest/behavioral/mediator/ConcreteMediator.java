package com.github.xbest.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by link on 2017/3/3.
 */
public class ConcreteMediator implements Mediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void notifyAllMessage(User user) {
        for (User u : users) {
            if (!Objects.equals(u, user)) {
                u.receiveMessage(user.getMessage());
            }
        }
    }
}
