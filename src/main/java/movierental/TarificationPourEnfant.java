package movierental;

public class TarificationPourEnfant implements Tarification {

    public double calculerMontant(int dureeDeLocation) {
        double montant = 1.5;

        if (dureeDeLocation > 3) {
            montant += (dureeDeLocation - 3) * 1.5;
        }
        return montant;
    }
}
