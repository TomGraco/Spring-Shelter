package org.codeforall.services;

import org.codeforall.PetDB;
import org.codeforall.controllers.ShelterController;

public class ShelterService {
    private ShelterController shelterController;
    private PetDB petDB;

    public ShelterService(ShelterController shelterController) {
        this.shelterController = shelterController;
    }

    public ShelterService() {
    }
    public void retrieveDog(int petName) {
        petDB.removeDog(petName);
    }
    public void retrieveCat(int petName) {
        petDB.removeCat(petName);
    }
    public void returnDog(String petName) {
        shelterController.returnDog(petName);
    }
    public void returnCat(String petName) {
        shelterController.returnCat(petName);
    }
    public void addDog(String petName){
        petDB.addDog(petName);
    }
    public void addCat(String petName){
        petDB.addCat(petName);
    }
    public void euthanizeDogs(){
        petDB.killAllDogs();
    }
    public void euthanizeCats(){
        petDB.killAllCats();
    }



    public PetDB getPetDB() {
        return petDB;
    }

    public void setPetDB(PetDB petDB) {
        this.petDB = petDB;
    }

}