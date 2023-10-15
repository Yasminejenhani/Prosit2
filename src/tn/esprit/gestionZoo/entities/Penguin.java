package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    private float SwimmingDepth;

    public Penguin(String family,String name,int age,boolean isMammal,String habitat, float SwimmingDepth){
        super(family, name, age, isMammal, habitat);

        this.SwimmingDepth=SwimmingDepth;
    }
    @Override
    public String toString() {
        return "Penguin's Family: " + family + ", Name: " + name + ", Age: " + age + ", Is mammal: " + isMammal +" Habitat: " + habitat + ",  Swimming Depth: " + SwimmingDepth;
    }
}
