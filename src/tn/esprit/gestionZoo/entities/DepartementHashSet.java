package tn.esprit.gestionZoo.entities;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

     HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }
    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = departements.iterator();
        while (it.hasNext()) {
            Departement departement = it.next();
            if (Objects.equals(departement.getNom_departement(), nom))
                return true;
        }
        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
         departements.remove(departement);

    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departements) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
       return new TreeSet<>(departements);
    }
}
