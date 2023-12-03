package tn.esprit.gestionZoo.entities;

import java.util.*;

public class AffectationHashMap {
     HashMap<Employe, Departement> affectation;

    public AffectationHashMap() {
        this.affectation = new HashMap<>();
    }

   public void ajouterEmployeDepartement(Employe e, Departement d){
       affectation.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (HashMap.Entry<Employe, Departement> entry : affectation.entrySet()) {
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println("Employe: " + employe + " - Departement: " + departement);
        }
    }
    public void supprimerEmploye (Employe e){
        affectation.remove(e);
    }
    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        Iterator<Map.Entry<Employe, Departement>> iterator = affectation.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employe, Departement> entry = iterator.next();
            if (entry.getKey().equals(e) && entry.getValue().equals(d)) {
                iterator.remove();
                break;
            }
        }
    }
    public void displayAffectations() {
        for (Map.Entry<Employe, Departement> entry : affectation.entrySet()) {
            Employe employe = entry.getKey();
            Departement departement = entry.getValue();
            System.out.println("Employe: " + employe + " - Departement: " + departement);
        }
    }
    public void afficherEmployes() {
        for (Employe employe : affectation.keySet()) {
            System.out.println("Employe: " + employe);
        }
    }
    public void afficherDepartements() {
        for (Departement departement : affectation.values()) {
            System.out.println("Departement: " + departement);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectation.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(new EmployeComparator());
        sortedMap.putAll(affectation);
        return sortedMap;
    }

}
