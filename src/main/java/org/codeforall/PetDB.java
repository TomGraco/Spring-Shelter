package org.codeforall;

import java.util.ArrayList;
import java.util.List;

public class PetDB {
    private List<String> dogs;
    private List<String> cats;
    public PetDB() {
        dogs = new ArrayList<>();
        dogs.add("Farrusco");
        dogs.add("Mel");
        dogs.add("Sara");
        dogs.add("Max");
        dogs.add("Luna");
        cats = new ArrayList<>();
        cats.add("Whiskers");
        cats.add("Smithers");
        cats.add("Misty");
        cats.add("Socks");
        cats.add("Puffy");
    }

    public void killAllDogs(){
        dogs.clear();
    }
    public void killAllCats(){
        cats.clear();
    }
    public void removeDog(int petName) {
        dogs.remove(petName);
    }
    public void removeCat(int petName) {
        cats.remove(petName);
    }
    public List<String> getDogsList(){
        return dogs;
    }
    public List<String> getCatsList(){
        return cats;
    }
    public void addDog(String petName){
        dogs.add(petName);
    }
    public void addCat(String petName){
        cats.add(petName);
    }
}
