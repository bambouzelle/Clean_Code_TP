package ex2;

//Représente un livret A qui ne peut pas être à découvert.

public class LivretA extends CompteBancaire {

    // Le taux de rémunération annuel du livret A.

    private double tauxRemuneration;

    // Constructeur pour un livret A.
 
    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (solde - montant >= 0) {
            solde -= montant;
        } else {
            System.out.println("Débit refusé : le livret A ne peut pas être à découvert.");
        }
    }

    //Applique la rémunération annuelle au solde.
    public void appliquerRemunerationAnnuelle() {
        solde += solde * tauxRemuneration / 100;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
