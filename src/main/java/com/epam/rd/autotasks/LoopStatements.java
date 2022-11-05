package com.epam.rd.autotasks;

import java.util.stream.Stream;

class LoopStatements {
    public static int sumOfFibonacciNumbers(int n) {
        if (n <=0) {
            throw new IllegalArgumentException();
        }
        return Stream.iterate(new int[] {0,1}, array -> new int[] {array[1], array[0] + array[1]})
                .limit(n)
                .map(array -> array[0]).mapToInt(Integer::valueOf).sum();
    }
}