package ex5;

import java.util.ArrayList;
import java.util.List;

// Classe représentant une caisse capable de contenir des objets.

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMax;

    //Constructeur.

    public Caisse(String nom, int poidsMax) {
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMax = poidsMax;
    }

    //Méthode permettant de vérifier si cette caisse accepte l'objet.  
    public boolean accepte(Item item) {
        return item.getPoids() <= poidsMax;
    }

    // Ajoute un objet dans la caisse.
    public void ajouterItem(Item item) {
        items.add(item);
    }

    public String getNom() {
        return nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

