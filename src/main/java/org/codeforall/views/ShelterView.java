package org.codeforall.views;

import org.academiadecodigo.bootcamp.InputScanner;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.codeforall.PetDB;
import org.codeforall.controllers.ShelterController;

public class ShelterView {
    private ShelterController shelterController;
    private PetDB petDB;
    private Prompt prompt;


    public void show() {
        showShelterName();
        showAvailableOptions();
    }

    private void showShelterName() {
        System.out.println("Welcome to the Shelter!\n");
    }

    private void showAvailableOptions() {

        String[] options = {"Adopt!", "Abandon!", "Euthanize", "Exit"};
        prompt = new Prompt(System.in, System.out);
        MenuInputScanner choiceScanner = new MenuInputScanner(options);
        choiceScanner.setMessage("Choose an option:");
        int choice = prompt.getUserInput(choiceScanner);
        switch (choice) {
            case 1:
                showAnimalsAvailable();
                break;
            case 2:
                abandon();
                break;
            case 3:
                euthanizeAllAnimals();
                break;
            case 4:
                System.out.println("Exiting the Shelter... Goodbye!");
                break;
            default:
                System.out.println("That option does not exist. Please choose a valid one.");
                showAvailableOptions();
        }

    }

    private void abandon() {
        String[] options = {"Dog!", "Cat"};
        prompt = new Prompt(System.in, System.out);
        MenuInputScanner choiceScanner = new MenuInputScanner(options);
        choiceScanner.setMessage("Name of the pet u want do abandon: ");
        switch (prompt.getUserInput(choiceScanner)) {
            case 1:
                abandonDog();
                break;
            case 2:
                abandonCat();
                break;
            default:
                System.out.println("That type of pet does not exist. Please choose a valid one.");
                abandon();
        }
    }

    private void showAnimalsAvailable() {
        String[] types = {"Dogs", "Cats"};
        prompt = new Prompt(System.in, System.out);
        MenuInputScanner choiceScanner = new MenuInputScanner(types);
        choiceScanner.setMessage("Choose an option:");
        int choice = prompt.getUserInput(choiceScanner);
        switch (choice) {
            case 1:
                showDogsAvailable();
                break;
            case 2:
                showCatsAvailable();
                break;
            default:
                System.out.println("That type of pet does not exist. Please choose a valid one.");
                showAnimalsAvailable();
        }
    }

    private void abandonCat() {
        System.out.println("Why do you do this to us!");
        prompt = new Prompt(System.in, System.out);
        StringInputScanner scanner = new StringInputScanner();
        scanner.setMessage("Name of the cat u want do abandon: ");
        shelterController.addCat(prompt.getUserInput(scanner));
        showAvailableOptions();
    }
    private void abandonDog() {
        System.out.println("Why do you do this to us!");
        prompt = new Prompt(System.in, System.out);
        StringInputScanner scanner = new StringInputScanner();
        scanner.setMessage("Name of the dog u want do abandon: ");
        shelterController.addDog(prompt.getUserInput(scanner));
        showAvailableOptions();
    }
    private void euthanizeAllAnimals() {
        shelterController.killAllDogs();
        shelterController.killAllCats();
        System.out.println("All animals have been euthanized!");
        System.out.println("The shelter is now empty!");
        showAvailableOptions();

    }
    private void showDogsAvailable() {

        String[] dogs = petDB.getDogsList().toArray(new String[petDB.getDogsList().size()]);
        prompt = new Prompt(System.in, System.out);
        MenuInputScanner choiceScanner = new MenuInputScanner(dogs);

        if (petDB.getDogsList().size() == 0) {
            System.out.println("No dogs available for adoption!");
            showAvailableOptions();
            return;
        }
        choiceScanner.setMessage("Dogs available for adoption:");
        int choice = prompt.getUserInput(choiceScanner);
        switch (choice) {
            case 1:
                System.out.println("Adopted " + dogs[0]);
                shelterController.adoptDog(0);
                showAvailableOptions();
                break;
            case 2:
                System.out.println("Adopted " + dogs[1]);
                shelterController.adoptDog(1);
                showAvailableOptions();
                break;
            case 3:
                System.out.println("Adopted " + dogs[2]);
                shelterController.adoptDog(2);
                showAvailableOptions();
                break;
            case 4:
                System.out.println("Adopted " + dogs[3]);
                shelterController.adoptDog(3);
                showAvailableOptions();
                break;
            case 5:
                System.out.println("Adopted " + dogs[4]);
                shelterController.adoptDog(4);
                showAvailableOptions();
                break;
            default:
                System.out.println("That dog does not exist. Please choose a valid pet.");
                showDogsAvailable();
        }
    }
    private void showCatsAvailable() {

        String[] cats = petDB.getCatsList().toArray(new String[petDB.getCatsList().size()]);
        prompt = new Prompt(System.in, System.out);
        MenuInputScanner catsScanner = new MenuInputScanner(cats);

        if (petDB.getCatsList().size() == 0) {
            System.out.println("No cats available for adoption.");
            showAvailableOptions();
            return;
        }
        catsScanner.setMessage("Cats available for adoption:");
        int choice = prompt.getUserInput(catsScanner);
        switch (choice) {
            case 1:
                System.out.println("Adopted " + cats[0]);
                shelterController.adoptCat(0);
                showAvailableOptions();
                break;
            case 2:
                System.out.println("Adopted " + cats[1]);
                shelterController.adoptCat(1);
                showAvailableOptions();
                break;
            case 3:
                System.out.println("Adopted " + cats[2]);
                shelterController.adoptCat(2);
                showAvailableOptions();
                break;
            case 4:
                System.out.println("Adopted " + cats[3]);
                shelterController.adoptCat(3);
                showAvailableOptions();
                break;
            case 5:
                System.out.println("Adopted " + cats[4]);
                shelterController.adoptCat(4);
                showAvailableOptions();
                break;
            default:
                System.out.println("That cat does not exist. Please choose a valid pet.");
                showCatsAvailable();
        }
    }



    public void setShelterController(ShelterController shelterController) {
        this.shelterController = shelterController;
    }
    public void setPetDB(PetDB petDB) {
        this.petDB = petDB;
    }
}
