package com.github.xbest.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by link on 2017/3/4.
 */
public class Client {
    public static void main(String[] args) {
        PersonList personList = new DefaultPersonList();
        Iterator iterator = personList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
