package movierental;

public class TarificationClassique implements Tarification {

    public double calculerMontant(int dureeDeLocation) {
        double montant = 2;

        if(dureeDeLocation > 2) {
            montant += (dureeDeLocation - 2) * 1.5;
        }
        return montant;
    }
}
