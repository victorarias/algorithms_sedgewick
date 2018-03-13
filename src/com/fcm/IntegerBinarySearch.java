package com.fcm;

import edu.princeton.cs.algs4.StdOut;

public class IntegerBinarySearch {
    public static int indexOf(int key, int[] list) {
        int minPos = 0;
        int maxPos = list.length - 1;

        while(true) {
            int midPos = (maxPos - minPos) / 2;
            int current = list[midPos];

            StdOut.printf("max = %d, min = %d, midPos = %d, current = %d, key = %d\n", maxPos, minPos, midPos, current, key);

            if (current == key) {
                return midPos;
            } else if (key < current) {
                maxPos = midPos + 1;
            } else {
                minPos = midPos + 1;
            }
        }
    }
}
