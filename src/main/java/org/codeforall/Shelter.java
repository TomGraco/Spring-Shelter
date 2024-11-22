package org.codeforall;

import org.codeforall.pets.Cat;
import org.codeforall.pets.Dog;
import org.codeforall.pets.Pet;

public class Shelter {
    public Pet adoptRandomPet() {
        return Math.random() < 0.5? new Cat() : new Dog();
    }
}
