package org.codeforall.pets;

public class Dog implements Pet {
    public Dog() {
        System.out.println("I'm a dog");
    }

    @Override
    public void talk() {
        System.out.println("Woof woof WOOF");
    }
}
