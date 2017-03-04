package com.github.xbest.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by link on 2017/3/4.
 */
public interface PersonList {
    public List<Person> getPersonList();

    public Iterator<Person> iterator();
}
