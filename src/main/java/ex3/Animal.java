package ex3;

// Classe représentant un animal du zoo avec ses caractéristiques.

public class Animal {

    private String nom;
    private TypeAnimal type;
    private ComportementAnimal comportement;

    public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    public String getNom() {
        return nom;
    }

    public TypeAnimal getType() {
        return type;
    }

    public ComportementAnimal getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " (" + type + ", " + comportement + ")";
    }
}
