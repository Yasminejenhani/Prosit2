package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZooManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // # instruction 14
         final int nbrCages=25;
        //System.out.println("Donner le nombre de cages");
        // int nbrCages = sc.nextInt();

       // System.out.println("Donner le nom du zoo");
        //String zooName = sc.next();
        //System.out.println(zooName+ " comporte " +nbrCages+" Cages");

        //Zoo belvedere = new Zoo(zooName, "Tunis", nbrCages);
        Zoo zoo1 = new Zoo("zoo1", "Tunis", nbrCages);
        Zoo zoo2 = new Zoo("zoo2", "Sousse", nbrCages);

        Animal lion = new Animal("Lions", "lion1", 12, true);
        Animal tiger = new Animal("Tigers", "tiger1", 15, true);
        Animal elephant = new Animal("Elephants", "elephant1", 16, true);
        boolean lionAdded = zoo1.addAnimal(lion);
        boolean tigerAdded = zoo2.addAnimal(tiger);
        //boolean elephantAdded = belvedere.addAnimal(elephant);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        //zoo1.addAnimal(elephant);

        Animal giraffe = new Animal("Giraffes", "giraffe1", 9, true);
        Animal rhino = new Animal("Rhinos", "rhino1", 14, true);
        Animal zebra = new Animal("Zebras", "zebra1", 7, true);

        zoo2.addAnimal(giraffe);
        zoo2.addAnimal(rhino);
        zoo2.addAnimal(zebra);
        if (zoo1.isZooFull()) {
            System.out.println("The zoo is full!");
        } else {
            System.out.println("The zoo is not full.");
        }

       // System.out.println("Lion ajouté au zoo : " + lionAdded);
        //System.out.println("Tigre ajouté au zoo : " + tigerAdded);
        //System.out.println("Éléphant ajouté au zoo : " + elephantAdded);


        Zoo result = Zoo.compareZoo(zoo1, zoo2);

        if (result != null) {
            System.out.println("The zoo with more animals is: " + result);
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }


        //System.out.println(lion);
        //System.out.println(zoo1);
        //zoo1.displayZoo();
        //tiger.displayAnimal();
        //zoo1.displayAllAnimals();
        //zoo1.searchAnimal(elephant);
        //zoo1.removeAnimal(elephant);
        //zoo1.displayAllAnimals();
        Aquatic fish = new Aquatic("fish1", "daurade", 2, true, "sea");
        Terrestrial tigre = new Terrestrial("tigers", "tiger2", 3, true, 4);

        Dolphin dolphin = new Dolphin("delphins", "dauphin1",12,true,"oceans",25.5f);
        Penguin penguin = new Penguin("penguins","penguin1",28,true,"Antarctic", 10.0f);
      //  System.out.println(fish);
       // System.out.println(tigre);
         System.out.println(dolphin);
        System.out.println(penguin);
        Aquatic shark = new Aquatic("Fish", "Shark", 5, false, "Ocean");
        zoo1.addAquaticAnimal(shark);
        System.out.println(shark);

        dolphin.swim();
        fish.swim();
        penguin.swim(); //je remarque que meme si je n'ai pas défini la méthode swim dans la classe penguin , elle a hérité cette méthode de la classe mère aquatic
        shark.swim();
        //INSTRUCTION 27 : je ne remarque rien , je peux appeler la méthode swim
        zoo1.displayNumberOfAquaticsByType(); //i have a problem in the incrementation of nbDolphins and nbPenguins
    }


}