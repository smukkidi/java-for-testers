package com.smukkidi.polymorpism.unittestingruntime;

import com.smukkidi.polymorpism.runtime.Animal;
import com.smukkidi.polymorpism.runtime.Cat;
import com.smukkidi.polymorpism.runtime.Dog;
import com.smukkidi.polymorpism.runtime.Horse;

public class MainAnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        testAnimal(dog);

        Cat cat = new Cat();
        testAnimal(cat);

        Horse horse = new Horse();
        testAnimal(horse);
    }

    private static void testAnimal(Animal a) {
        a.makeSound();
        a.walking();
    }

}
