package ex1;

import java.util.Date;

// Classe représentant une entreprise avec ses attributs principaux.

public class Entreprise {

    // Le capital maximal autorisé pour l'entreprise.

    public static final int CAPITAL_MAX = 3000000;

    //Le numéro SIRET de l'entreprise.
    private int siret;

    //Le nom de l'entreprise.
    private String nom;

    //L'adresse de l'entreprise.
    private String adresse;

    //La date de création de l'entreprise.
    private Date dateCreation;

    //Affiche le statut de l'entreprise.
    public void afficherStatut() {
        // Méthode à implémenter
    }

    // Getters et setters
    
    //Retourne le numéro SIRET de l'entreprise.
    public int getSiret() {
        return siret;
    }

    //Définit le numéro SIRET de l'entreprise.
    public void setSiret(int siret) {
        this.siret = siret;
    }

    //Retourne le nom de l'entreprise.
    public String getNom() {
        return nom;
    }

    // Définit le nom de l'entreprise.
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Retourne l'adresse de l'entreprise.
    public String getAdresse() {
        return adresse;
    }

    // Définit l'adresse de l'entreprise.
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //Retourne la date de création de l'entreprise.

    public Date getDateCreation() {
        return dateCreation;
    }

    // Définit la date de création de l'entreprise.
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
