package org.codeforall.pets;

public class Cat implements Pet {
    public Cat() {
        System.out.println("I'm a cat");
    }

    @Override
    public void talk() {
        System.out.println("Miau miau MIAU");
    }
}
