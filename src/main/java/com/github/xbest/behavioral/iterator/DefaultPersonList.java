package com.github.xbest.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by link on 2017/3/4.
 */
public class DefaultPersonList implements PersonList {
    private final int PERSON_SIZE = 20;
    private final List<Person> personList = new ArrayList<>(PERSON_SIZE);

    public DefaultPersonList() {
        Random random = new Random();
        for (int i = 0; i < PERSON_SIZE; i++) {
            this.personList.add(new Person("name" + i, random.nextInt(2), i + 10));
        }
    }

    @Override
    public List<Person> getPersonList() {
        return this.personList;
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator(this.personList);
    }
}
