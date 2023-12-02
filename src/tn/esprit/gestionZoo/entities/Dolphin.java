package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    private float  swimmingSpeed;
    public Dolphin(String family,String name,int age,boolean isMammal,String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);

        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin's Family: " + family + ", Name: " + name + ", Age: " + age + ", Is mammal: " + isMammal +" Habitat: " + habitat + ", Swimming Speed: " + swimmingSpeed;
    }
    public void swim(){
        System.out.println("this dolphin is swimming");}
    @Override
    public void eatMeat(Food meat) {
        System.out.println("This animal from dolphin's family is eating meat");
    }

}
