package tn.esprit.gestionZoo.entities;
public class Animal {
    protected static String family ;
    protected String name ;
    protected int age;
    protected boolean isMammal ;

    public Animal(){

    }

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getFamily() {
        return family;
    }
    public boolean getIsMammal() {
        return isMammal;
    }

    @Override
    public String toString(){
        return "Animal :" +
                "family= "+ family+
                " ,name= "+name+
                " , age=" +age+
                " ,isMammal= "+isMammal+
                '}';
    }
    public void displayAnimal(){
        System.out.println("Family = "+this.family+ " ,name ="+this.name+ " ,age = "+this.age+ " ,isMammal= "+isMammal);
    }

}
