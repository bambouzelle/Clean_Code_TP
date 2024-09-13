package ex2;

// Représente un compte courant avec un découvert autorisé.

public class CompteCourant extends CompteBancaire {

    //Le découvert autorisé pour le compte courant.
    private double decouvertAutorise;

    //Constructeur pour un compte courant.
    public CompteCourant(double solde, double decouvertAutorise) {
        super(solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void debiterMontant(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Débit refusé : dépassement du découvert autorisé.");
        }
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }
}
