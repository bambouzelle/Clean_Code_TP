package ex2;

//Classe abstraite représentant un compte bancaire de base.
 
public abstract class CompteBancaire {

    //
    protected double solde;

    // Constructeur de base pour un compte bancaire.
    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    //Méthode pour créditer un montant sur le compte.
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Méthode abstraite pour débiter un montant du compte.
     * Doit être implémentée dans les classes enfants.
     */
    public abstract void debiterMontant(double montant);

    // Getter pour obtenir le solde actuel du compte.

    public double getSolde() {
        return solde;
    }
}
