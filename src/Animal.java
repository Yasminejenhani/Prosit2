public class Animal {
    String family ;
    String name ;
    int age;
    boolean isMammal ;

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
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
