package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    private float  swimmingSpeed;
    public Dolphin(String habitat, float swimmingSpeed) {
        super();
        this.habitat = habitat;
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return " Habitat: " + habitat + ", Swimming Speed: " + swimmingSpeed;
    }
    public void swim(){
        System.out.println("this dolphin is swimming");}

}
