package ex3;

import java.util.ArrayList;
import java.util.List;

//Classe représentant un zoo qui contient des animaux.

public class Zoo {

    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    //Ajoute un animal au zoo.
    public void addAnimal(String nom, TypeAnimal type, ComportementAnimal comportement) {
        animaux.add(new Animal(nom, type, comportement));
    }

    //Affiche la liste des animaux présents dans le zoo.

    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    //Retourne le nombre total d'animaux dans le zoo.
    public int taille() {
        return animaux.size();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
