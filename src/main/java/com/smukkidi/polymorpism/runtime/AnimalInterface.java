package com.smukkidi.polymorpism.runtime;

public interface AnimalInterface {

    default void makeSound(){
        System.out.println("I am animal, brrrr....");
    }
    default void walking(){
        System.out.println("I am walking.");
    }
}
