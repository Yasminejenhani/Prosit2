package tn.esprit.gestionZoo.entities;

import java.util.Comparator;

class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe emp1, Employe emp2) {
        return Integer.compare(emp1.getId(), emp2.getId());
    }
}

