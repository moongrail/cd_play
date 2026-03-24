package org.example.kuy8;

import java.util.stream.IntStream;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        if (array.length < 1) return array;

        return IntStream.range(0, array.length)
                .filter(x -> x == 0 ? array[x] == 0 : array[x] % x == 0)
                .map(x -> array[x])
                .toArray();
    }
}
