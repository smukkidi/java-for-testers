package com.smukkidi.polymorpism.compiletime;

public class AreaCalculator{

   
    /**
     * THis method accepts int values
     * @param side
     * @return
     */

     // Squire

    public int getArea(int side){
       return side * side;
    }

    // What if we have decimal values, we can override the same method so that we can have same method works for both of them.

    // THis method is over loaded method to get area which can accepts the decimal values by changing return type of method we have achieved.
    public double getArea(double side){
        return side * side;
    }

    // Rectangle when the both sides are not same 
    public int getArea(int width, int height){
        return width * height;
    }

    public double getArea(double width, double height){
        return width * height;
    }
}