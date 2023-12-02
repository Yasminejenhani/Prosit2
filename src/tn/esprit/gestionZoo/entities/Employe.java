package tn.esprit.gestionZoo.entities;

import java.util.Objects;

public class Employe implements Comparable<Employe>{
    protected int id;
    protected String nom;
    protected String prenom;
    protected String nom_departement;
    protected int grade;

    public Employe(){

    }
    public Employe(int id,String nom,String prenom,String nom_departement,int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nom_departement=nom_departement;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nom_departement='" + nom_departement + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


        public int compareTo(Employe o) {
            return Integer.compare(this.id, o.id);
        }

}
