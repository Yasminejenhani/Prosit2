package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    private int nbrLegs;


    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return "terrestrial's Family: " + family + ", Name: " + name + ", Age: " + age + ", Is mammal: " + isMammal + ", NbrLegs: " + nbrLegs ;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("This animal from terrestial's family is eating meat");
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("This animal from terrestial's family is eating plant");
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("This animal from terrestial's family is eating meat and plant");
    }
}
