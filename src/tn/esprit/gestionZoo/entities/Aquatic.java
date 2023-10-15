package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal{
    protected String habitat;


public Aquatic(){}
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }
    @Override
    public String toString() {
        return "Aquatic's Family: " + family + ", Name: " + name + ", Age: " + age + ", Is mammal: " + isMammal + ", Habitat: " + habitat ;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }

}
