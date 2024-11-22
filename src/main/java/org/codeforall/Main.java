package org.codeforall;

import org.codeforall.controllers.ShelterController;
import org.codeforall.services.ShelterService;
import org.codeforall.views.ShelterView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-config.xml");
        ShelterController shelterController = context.getBean("shelterController", ShelterController.class);
        shelterController.start();




        //PetDB petDB = context.getBean("petDB", PetDB.class);
    }
}
