import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de cages");
        int nbrCages = sc.nextInt();

        System.out.println("Donner le nom du zoo");
        String zooName = sc.next();
        System.out.println(zooName+ " comporte " +nbrCages+" Cages");

        Zoo belvedere = new Zoo(zooName, "Tunis", nbrCages);

        Animal lion = new Animal("Lions", "lion1", 12, true);
        Animal tiger = new Animal("Tigers", "tiger1", 15, true);
        Animal elephant = new Animal("Elephants", "elephant1", 16, true);

        boolean lionAdded = belvedere.addAnimal(lion);
        boolean tigerAdded = belvedere.addAnimal(tiger);
        boolean elephantAdded = belvedere.addAnimal(elephant);


        System.out.println("Lion ajouté au zoo : " + lionAdded);
        System.out.println("Tigre ajouté au zoo : " + tigerAdded);
        System.out.println("Éléphant ajouté au zoo : " + elephantAdded);


        System.out.println(lion);
        System.out.println(belvedere);
        belvedere.displayZoo();
        tiger.displayAnimal();
        belvedere.displayAllAnimals();
        belvedere.searchAnimal(elephant);
        belvedere.removeAnimal(elephant);
        belvedere.displayAllAnimals();

    }
}