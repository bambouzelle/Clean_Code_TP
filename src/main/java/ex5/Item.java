package ex5;

// Classe représentant un objet dans l'inventaire.
public class Item {

    private String nom;
    private int poids;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
