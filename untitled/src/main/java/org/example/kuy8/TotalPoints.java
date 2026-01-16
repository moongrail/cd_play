package org.example.kuy8;

import java.util.Arrays;

public class TotalPoints {

    public static int points(String[] games) {
//        int sum = 0;
//
//        for (String s : games) {
//            char x = s.charAt(0),
//                    y = s.charAt(2);
//
//            sum += x > y ? 3 : x == y ? 1 : 0;
//        }
//
//        return sum;
        //implement me
        return Arrays.stream(games)
                .map
                        (s -> {
                            int a = Integer.parseInt(s.substring(0, 1));
                            int b = Integer.parseInt(s.substring(s.length() - 1));
                            return a > b ? 3 : a == b ? 1 : 0;
                        })
                .mapToInt(i -> i)
                .sum();
    }


}
