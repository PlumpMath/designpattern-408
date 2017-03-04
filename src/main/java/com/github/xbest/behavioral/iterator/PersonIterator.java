package com.github.xbest.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式，访问一个集合对象的内容，而无需暴露它的内部表示。<br/>
 * 支持对集合对象多种遍历方式，为遍历不同的集合对象结构提供一个统一的接口。<br/>
 * 可以根据业务需求，实现各种各样的遍历方式，例如倒序遍历。<br/>
 * Created by link on 2017/3/4.
 */
public class PersonIterator implements Iterator {
    private List<Person> personList;
    private int index = -1;

    public PersonIterator(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean hasNext() {
        return personList != null && index < personList.size() - 1;
    }

    @Override
    public Object next() {
        if (personList != null && index < personList.size()) {
            return personList.get(++index);
        }
        return null;
    }

    @Override
    public void remove() {
        if (personList != null) {
            personList.remove(index);
        }
    }
}
