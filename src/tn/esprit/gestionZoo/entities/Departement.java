package tn.esprit.gestionZoo.entities;

import java.util.Objects;

public class Departement {
    protected int id;
    protected String nom_departement;
    protected int nb_empolye;
    public Departement(){

    }
    public Departement(int id, String nom_departement,int nb_empolye){
        this.id=id;
        this.nom_departement=nom_departement;
        this.nb_empolye=nb_empolye;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nb_empolye=" + nb_empolye +
                '}';
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom_departement, that.nom_departement);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNb_empolye() {
        return nb_empolye;
    }

    public void setNb_empolye(int nb_empolye) {
        this.nb_empolye = nb_empolye;
    }
}
