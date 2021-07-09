package com.kd.euler.level1;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Problem 1 - Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @Author Kuldeep Dhole
 */
public class MultiplesOf3And5 {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println("Solution1 = " + solution1());

        long endTime = System.nanoTime();
        long durationInNano = (endTime - startTime);
        System.out.print("Total time in millis = ");
        System.out.printf( "%,d\n", TimeUnit.NANOSECONDS.toMillis(durationInNano) );


        startTime = System.nanoTime();

        System.out.println("Solution2 = " + solution2());

        endTime = System.nanoTime();
        durationInNano = (endTime - startTime);
        System.out.print("Total time in millis = ");
        System.out.printf( "%,d\n", TimeUnit.NANOSECONDS.toMillis(durationInNano) );
    }

    private static int solution1() {
        return IntStream.range(3, 1000)
                .filter(n -> ((n%3 == 0) || (n%5 == 0)))
                .sum();
    }

    private static int solution2() {
        int sum = 0;

        for (int i=3; i<1000; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                sum += i;
            }
        }

        return sum;
    }
}
