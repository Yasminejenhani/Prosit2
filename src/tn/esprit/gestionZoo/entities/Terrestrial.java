package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;


    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return "terrestrial's Family: " + family + ", Name: " + name + ", Age: " + age + ", Is mammal: " + isMammal + ", NbrLegs: " + nbrLegs ;
    }

}
