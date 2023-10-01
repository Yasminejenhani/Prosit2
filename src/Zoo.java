import java.util.Scanner;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    int nbrAnimals;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return
                "Zoo : " +
                        "name= " + name +
                        " ,city= " + city +
                        " ,nbrCages=  " + nbrCages;
    }

    public void displayZoo() {
        System.out.println("ZooName = " + this.name + ", City = " + this.city + " , nbrCages = " + this.nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        boolean isAdded = false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                isAdded = true;
                nbrAnimals=nbrAnimals+1;
                break; // Sortir de la boucle une fois que l'animal a été ajouté.
            }
        }
        return isAdded;
    }

    public void displayAllAnimals() {

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("le nom du " + i + " ème animal :" + animals[i].name + " ,la famille : " + animals[i].family + " ,l'age est : " + animals[i].age);
            } else {
                break;
            }
        }
    }

    int searchAnimal(Animal animal) {
        int result = -1;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                result = i;
                System.out.println("l'animal d'indice "+i+ " a le meme nom que l'animal passé en paramètre");
                break;
            }
        }

        return result;
    }
    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                animals[i] = null;
                System.out.println("L'animal a été supprimé avec succès !");
                return true;
            }
        }
        System.out.println("Cet animal n'existe pas dans le zoo, impossible de le supprimer.");
        return false;
    }
    boolean isZooFull(){

       if (nbrAnimals<nbrCages){
           return false;
       }else {
       return true;

       }
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals < z2.nbrAnimals){
            return z2;
        } else if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }else {
            return null;
        }
    }
    }






