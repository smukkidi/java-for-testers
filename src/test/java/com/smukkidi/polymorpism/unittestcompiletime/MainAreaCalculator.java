package com.smukkidi.polymorpism.unittestcompiletime;

import com.smukkidi.polymorpism.compiletime.AreaCalculator;

public class MainAreaCalculator{

    public static void main(String[] args) {
        
        AreaCalculator a = new AreaCalculator();

        // Unit testing with int values
        System.out.println(a.getArea(5));

        // Unit testing with decimal values
        System.out.println(a.getArea(5.25));

          // Unit testing with int values
        System.out.println(a.getArea(5, 4));
        
        // Unit testing with decimal values
        System.out.println(a.getArea(5.25, 3.95));

    }
}