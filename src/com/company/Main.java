package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Given 2 int values, return whichever value is nearest to the value 10,
        // Or return 0 in the event of a tie.
        // Note that Math.abs(n) returns the absolute value of a number.
        // If I call the function with the values below it should yield the following result
        //In main…

        close10(8, 13); //should return 8
        System.out.println(close10(13, 8)); //should return 8
        System.out.println(close10(13, 7));; //should return 0
    }

    static int close10(int a, int b) {
        int absA = Math.abs(10-a);
        int absB = Math.abs(10-b);

        if (absA<absB)
            return a;
        else if(absA>absB)
            return b;
        else
            return 0;

    }
}
