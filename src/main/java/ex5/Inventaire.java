package ex5;

import java.util.ArrayList;
import java.util.List;

//Classe représentant l'inventaire contenant plusieurs caisses.

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 5));  // Caisse pour objets < 5kg
        caisses.add(new Caisse("Moyens objets", 20)); // Caisse pour objets de 5 à 20kg
        caisses.add(new Caisse("Grands objets", Integer.MAX_VALUE)); // Caisse pour objets > 20kg
    }

    // Ajoute un item dans l'inventaire en le plaçant dans la bonne caisse.
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepte(item)) {
                caisse.ajouterItem(item);
                break; // Sortir dès qu'une caisse accepte l'objet
            }
        }
    }

    // Retourne la taille totale de tous les objets dans toutes les caisses.
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
