package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZooManagement {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        // # instruction 14
     final int nbrCages=3;
//        //System.out.println("Donner le nombre de cages");
//        // int nbrCages = sc.nextInt();
//
//       // System.out.println("Donner le nom du zoo");
//        //String zooName = sc.next();
//        //System.out.println(zooName+ " comporte " +nbrCages+" Cages");
//
//        //Zoo belvedere = new Zoo(zooName, "Tunis", nbrCages);
     Zoo zoo1 = new Zoo("zoo1", "Tunis", nbrCages);
//        Zoo zoo2 = new Zoo("zoo2", "Sousse", nbrCages);
//
       Animal lion = new Animal("Lions", "lion1", 12, true);
       Animal tiger = new Animal("Tigers", "tiger1", 15, true);
       Animal elephant = new Animal("Elephants", "elephant1", 16, true);
//        //boolean lionAdded = zoo1.addAnimal(lion);
//        //boolean tigerAdded = zoo2.addAnimal(tiger);
//        //boolean elephantAdded = belvedere.addAnimal(elephant);
//
//       // zoo1.addAnimal(lion);
//        //zoo1.addAnimal(tiger);
//        //zoo1.addAnimal(elephant);
//
   //     Animal giraffe = new Animal("Giraffes", "giraffe1", -9, true);
////        Animal rhino = new Animal("Rhinos", "rhino1", 14, true);
////        Animal zebra = new Animal("Zebras", "zebra1", 7, true);
//
//       // zoo2.addAnimal(giraffe);
//        //zoo2.addAnimal(rhino);
//        //zoo2.addAnimal(zebra);
//        if (zoo1.isZooFull()) {
//            System.out.println("The zoo is full!");
//        } else {
//            System.out.println("The zoo is not full.");
//        }
//
//       // System.out.println("Lion ajouté au zoo : " + lionAdded);
//        //System.out.println("Tigre ajouté au zoo : " + tigerAdded);
//        //System.out.println("Éléphant ajouté au zoo : " + elephantAdded);
//
//
//        Zoo result = Zoo.compareZoo(zoo1, zoo2);
//
//        if (result != null) {
//            System.out.println("The zoo with more animals is: " + result);
//        } else {
//            System.out.println("Both zoos have the same number of animals.");
//        }
//
//
//        //System.out.println(lion);
//        //System.out.println(zoo1);
//        //zoo1.displayZoo();
//        //tiger.displayAnimal();
//        //zoo1.displayAllAnimals();
//        //zoo1.searchAnimal(elephant);
//        //zoo1.removeAnimal(elephant);
//        //zoo1.displayAllAnimals();
//        Aquatic fish = new Aquatic("fish1", "daurade", 2, true, "sea");
//        Terrestrial tigre = new Terrestrial("tigers", "tiger2", 3, true, 4);
//
//        Dolphin dolphin = new Dolphin("delphins", "dauphin1",12,true,"oceans",25.5f);
//        Penguin penguin = new Penguin("penguins","penguin1",28,true,"Antarctic", 10.0f);
//      //  System.out.println(fish);
//       // System.out.println(tigre);
//         System.out.println(dolphin);
//        System.out.println(penguin);
//        Aquatic shark = new Aquatic("Fish", "Shark", 5, false, "Ocean");
//        zoo1.addAquaticAnimal(shark);
//        System.out.println(shark);
//
//        dolphin.swim();
//        fish.swim();
//        penguin.swim(); //je remarque que meme si je n'ai pas défini la méthode swim dans la classe penguin , elle a hérité cette méthode de la classe mère aquatic
//        shark.swim();
//        //INSTRUCTION 27 : je ne remarque rien , je peux appeler la méthode swim
//        zoo1.displayNumberOfAquaticsByType();
        try {
            zoo1.addAnimal(lion);
            zoo1.addAnimal(tiger);
            zoo1.addAnimal(elephant);
          //  zoo1.addAnimal(giraffe);

        } catch (ZooFullException e) {
            System.out.println("Zoo is full: " + e.getMessage());
        } catch (AgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
//        Penguin p1 = new Penguin("penguins", "penguin", 3, true, "Ocean", 100.6f);
//        System.out.println(p1);
//        p1.eatMeat(Food.MEAT);
//
//
//        Dolphin d1 = new Dolphin("Delphins", "Delphin1", 5, true, "Ocean", 100.25f);
//        System.out.println(d1);
//        d1.eatMeat(Food.MEAT);
//
//        Terrestrial t1 = new Terrestrial("Terrestials", "Lion", 4, true, 4);
//        System.out.println(t1);
//        t1.eatPlantAndMeet(Food.BOTH);
//
//        Terrestrial t2 = new Terrestrial("Terrestials", "Elephant", 6, true, 4);
//        System.out.println(t2);
//        t2.eatPlant(Food.PLANT);

        //PROSIT 11
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        Employe emp1 = new Employe(14420,"Jenhani","Yasmine","informatique",3);
        Employe emp2 = new Employe(13487,"Hugo","Victor","français",10);
        Employe emp3 = new Employe(17487,"toDelete","employe","Math",4);
        Departement dep1 = new Departement(103,"informatique",15);
        Departement dep2 = new Departement(105,"Français",18);
        Departement dep3 = new Departement(107,"Math",18);


        affectationHashMap.ajouterEmployeDepartement(emp1, dep1);
        affectationHashMap.ajouterEmployeDepartement(emp2, dep2);
        affectationHashMap.ajouterEmployeDepartement(emp3, dep3);


        System.out.println("displaying employees and their departements");
        affectationHashMap.afficherEmployesEtDepartements();

        affectationHashMap.ajouterEmployeDepartement(emp1, dep2);


        System.out.println(" \n Updated Affectations:");
        affectationHashMap.afficherEmployesEtDepartements();
        // Je remarque que l'employe 1 est maintenant affecté au departement 2 au lieu du département 1 et le departement 1 a été remplacé par dep2
        //trying to delete an emp
        affectationHashMap.supprimerEmploye(emp3);
        affectationHashMap.supprimerEmployeEtDepartement(emp3,dep3);
        //affichage des departements et des employes
        System.out.println("Employes:");
        affectationHashMap.afficherEmployes();

        System.out.println("\nDepartements:");
        affectationHashMap.afficherDepartements();

        //testing the existing of employe and departments
        if (affectationHashMap.rechercherEmploye(emp1)) {
            System.out.println("Emp1 "+emp1.getNom()+" exists in the collection.");
        } else {
            System.out.println("Emp1 does not exist in the collection.");
        }

        if (affectationHashMap.rechercherDepartement(dep1)) {
            System.out.println("Departement1 "+dep1.getNom_departement()+" exists in the collection.");
        } else {
            System.out.println("Departement1 " +dep1.getNom_departement()+ " does not exist in the collection (that's the departement that has been replaced).");
        }
        if (affectationHashMap.rechercherDepartement(dep2)) {
            System.out.println("Departement2 " +dep2.getNom_departement()+" exists in the collection.");
        } else {
            System.out.println("Departement2 does not exist in the collection.");
        }

        System.out.println("\nAffectations (Unsorted):");
        affectationHashMap.displayAffectations();


        // Sorting the map
        TreeMap<Employe, Departement> sortedMap = affectationHashMap.trierMap();

        System.out.println("\nAffectations (Sorted by Employee Id):");
        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println("Employe: " + employe + " - Departement: " + departement);
        }


    }






    }

