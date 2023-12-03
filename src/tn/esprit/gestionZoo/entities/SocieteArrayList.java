package tn.esprit.gestionZoo.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> liste_employe;

    public SocieteArrayList() {
        liste_employe = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {

        liste_employe.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < liste_employe.size(); i++) {
            if (liste_employe.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return liste_employe.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {

        liste_employe.remove(employe);
    }

    @Override
    public void displayEmploye() {

        System.out.println(liste_employe);
    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(liste_employe);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(liste_employe, new Comparator<Employe>() {
            @Override
            public int compare(Employe emp1, Employe emp2) {
                // First, compare by nom
                int compareNom = emp1.getNom().compareTo(emp2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }

                // If nom is the same, compare by nom_departement
                int compareNomDepartement = emp1.getNom_departement().compareTo(emp2.getNom_departement());
                if (compareNomDepartement != 0) {
                    return compareNomDepartement;
                }

                // If nom_departement is also the same, compare by grade
                return Integer.compare(emp1.getGrade(), emp2.getGrade());
            }
        });
    }


}