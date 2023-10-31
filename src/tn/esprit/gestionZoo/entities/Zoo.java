package tn.esprit.gestionZoo.entities;

public class Zoo {
 private Animal[] animals;
 Aquatic[] aquaticAnimals = new Aquatic[10];

 private String name;
 private String city;
 private final int nbrCages;
 private int nbrAnimals;
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
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

    public void addAnimal(Animal animal) throws ZooFullException, AgeException {
        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException("Zoo is full. Cannot add more animals.");
        }

        if (animal.getAge() < 0) {
            throw new AgeException("Animal's age cannot be negative.");
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                nbrAnimals++;
                System.out.println(nbrAnimals);
                break;
            }
        }
    }



    public void displayAllAnimals() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("le nom du " + i + " ème animal :" + animals[i].getName() + " ,la famille : " + animals[i].getFamily() + " ,l'age est : " + animals[i].getAge());
            } else {
                break;
            }
        }
    }
    int searchAnimal(Animal animal) {
        int result = -1;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.getName().equals(animals[i].getName())) {
                result = i;
                System.out.println("l'animal d'indice "+i+ " a le meme nom que l'animal passé en paramètre");
                break;
            }
        }

        return result;

    }
    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animal.getName().equals(animals[i].getName())) {
                animals[i] = null;
                System.out.println("L'animal a été supprimé avec succès !");
                return true;
            }
        }
        System.out.println("Cet animal n'existe pas dans le zoo, impossible de le supprimer.");
        return false;
    }
    public boolean isZooFull(){

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
    public void addAquaticAnimal(Aquatic aquatic) {
        if (!isZooFull()) {

            for (int i = 0; i < aquaticAnimals.length; i++) {

                if (aquaticAnimals[i] == null) {
                    aquaticAnimals[i] = aquatic;

                    System.out.println("Aquatic animal added successfully.");
                    break;
                } else {
                    System.out.println("Aquatic animal could not be added. The aquatic animals array is full.");
                }
            }
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.f;

        for (Aquatic aquaticAnimal : aquaticAnimals) {

                Penguin penguin = (Penguin) aquaticAnimal;
                maxDepth = Math.max(maxDepth, penguin.getSwimmingDepth());

        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int nbDolphins = 0;
        int nbPenguins = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                nbDolphins++;
            }
            if (aquaticAnimal instanceof Penguin) {
                nbPenguins++;
            }
        }

        System.out.println("le nombre de dolphins est : " + nbDolphins + " Et le nombre des penguins = " + nbPenguins);
    }

    }









