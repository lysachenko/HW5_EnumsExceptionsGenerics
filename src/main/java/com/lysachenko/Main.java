package com.lysachenko;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myIntegerList = new MyList<>();
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);
        myIntegerList.add(5);

        System.out.println("Largest integer value: " + myIntegerList.getMax());
        System.out.println("Smallest integer value: " + myIntegerList.getMin());

        MyList<String> myStringList = new MyList<>();
        myStringList.add("fdfg");
        myStringList.add("ad");
        myStringList.add("fgd");
        myStringList.add("qweewqrw");
        myStringList.add("wewerwrert");

        System.out.println("\nLargest string value: " + myStringList.getMax());
        System.out.println("Smallest string value: " + myStringList.getMin());

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"brew", "rewrwe", "aaasd", "aa"};

        Universal<Integer> universalInteger = new Universal<>(integers);
        Universal<String> universalString = new Universal<>(strings);

        System.out.println("\nLargest in Integer Universal: " + universalInteger.getMax());
        System.out.println("Smallest in Integer Universal: " + universalInteger.getMin());

        System.out.println("\nLargest in String Universal: " + universalString.getMax());
        System.out.println("Smallest in String Universal: " + universalString.getMin());
    }
}
