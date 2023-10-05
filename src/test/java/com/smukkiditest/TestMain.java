package com.smukkiditest;

import com.smukkidi.lambda.GreetingService;

public class TestMain{

    public static void main(String[] args) {
        
        GreetingService gOne = n ->  System.out.println("Hi..." + n);
        
        GreetingService helloService = (n) -> System.out.println("Hello..." + n);
            
        gOne.greet("Sreenivasulu Reddy");
        helloService.greet("Sreenivasulu reddy");
    }

}