package com.lysachenko;

import java.util.ArrayList;

public class MyList<T extends Comparable<T>> {

    private final ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<T>();
    }

    public void add(T t) {
        list.add(t);
    }

    public T getMax() {
        T max = list.get(0);
        for (T value : list) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public T getMin() {
        T min = list.get(0);
        for (T value : list) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
