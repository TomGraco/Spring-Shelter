package org.codeforall.controllers;

import org.codeforall.services.ShelterService;
import org.codeforall.views.ShelterView;

public class ShelterController {
    private ShelterService shelterService;
    private ShelterView shelterView;

    public ShelterController(ShelterService shelterService,ShelterView shelterView) {
        this.shelterService = shelterService;
        this.shelterView = shelterView;
    }

    public ShelterController() {
    }

    public void start() {
        shelterView.show();
    }
    public void adoptDog(int petName) {
        shelterService.retrieveDog(petName);
    }
    public void adoptCat(int petName) {
        shelterService.retrieveCat(petName);
    }
    public void returnDog(String petName) {
        shelterService.returnDog(petName);
    }
    public void returnCat(String petName) {
        shelterService.returnCat(petName);
    }
    public void addDog(String petName){
        shelterService.addDog(petName);
    }
    public void addCat(String petName){
        shelterService.addCat(petName);
    }
    public void killAllDogs(){
        shelterService.euthanizeDogs();
    }
    public void killAllCats(){
        shelterService.euthanizeCats();
    }

}
