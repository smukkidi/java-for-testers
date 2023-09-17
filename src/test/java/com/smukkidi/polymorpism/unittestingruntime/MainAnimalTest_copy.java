package com.smukkidi.polymorpism.unittestingruntime;


import com.smukkidi.polymorpism.runtime.AnimalInterface;
import com.smukkidi.polymorpism.runtime.Cat_copy;
import com.smukkidi.polymorpism.runtime.Dog_copy;
import com.smukkidi.polymorpism.runtime.Horse_copy;

public class MainAnimalTest_copy {
    static AnimalInterface a;
    public static void main(String[] args) {

        a = new Dog_copy();
        testAnimal(a);

        a = new Cat_copy();
        testAnimal(a);

        a= new Horse_copy();
        testAnimal(a);
    }

    private static void testAnimal(AnimalInterface a) {
        a.makeSound();
        a.walking();
    }

}
