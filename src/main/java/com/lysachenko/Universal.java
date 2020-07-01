package com.lysachenko;

public class Universal<T extends Comparable<T>> {

    private T[] array;

    public Universal(T[] array) {
        this.array = array;
    }

    public T getMax() {
        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public T getMin() {
        T min = array[0];
        for (T value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
