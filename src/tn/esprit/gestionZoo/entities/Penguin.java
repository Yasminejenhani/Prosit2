package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    private float SwimmingDepth;

    public Penguin(String habitat, float SwimmingDepth){
        this.habitat=habitat;
        this.SwimmingDepth=SwimmingDepth;
    }
    @Override
    public String toString() {
        return  " Habitat: " + habitat + ", Swimming Depth: " + SwimmingDepth;
    }
}
