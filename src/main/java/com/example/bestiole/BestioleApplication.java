package com.example.bestiole;

import com.example.bestiole.domain.Specie;
import com.example.bestiole.service.SpecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BestioleApplication implements CommandLineRunner {
    @Autowired
    SpecieService service;
    public static void main(String[] args) {
        SpringApplication.run(BestioleApplication.class, args);
    }

    private void printList(){
        List<Specie> list = service.list();
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("**************************");
    }

    @Override
    public void run(String...args) throws Exception {
        printList();
        // Retourne toutes les especes
        List<Specie> list = service.list();
        list.stream().forEach(s -> System.out.println(s));
        printList();


        //Ajoute une espece
        Specie sp = new Specie("Renard", "Renardus");
        Long specie = service.create(sp);
        printList();


        // delete a spacie
        //Long idLong = (long)4;
        //service.deleteById(idLong);
        // printList();

    }

}
