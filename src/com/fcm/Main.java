package com.fcm;

import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        int[] items = { 1, 3, 5, 7, 9, 11, 12, 15 };
        int foundPosition = IntegerBinarySearch.indexOf(15, items);
        StdOut.printf("searched for %d, found %d", 15, items[foundPosition]);
    }
}
