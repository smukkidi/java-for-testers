package com.smukkiditest;

import com.smukkidi.lambda.GreetingService;

public class MultilineLambdaExpression {
    public static void main(String[] args) {

        GreetingService greetOne = (name) -> {

            System.out.println(" To upper case :: " + name.toUpperCase());
            System.out.println(" To lower case :: " + name.toLowerCase());
            System.out.println(" Length of the string :: " + name.length());
            System.out.println(" Substring :: " + name.substring(13));    
            
            
        };
        
        greetOne.greet("Sreenivasulu Reddy");

    }
}
