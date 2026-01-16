package org.example.kuy8;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        // your code
        int years;
        for (years = 0; desired > principal; years++) {
            principal += principal * interest * (1 - tax);
        }
        return years;
        1233ccccc
    }
}
