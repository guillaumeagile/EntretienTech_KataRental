package movierental;

public class TarificationRecent implements Tarification {

    public double calculerMontant(int dureeDeLocation) {
        return dureeDeLocation * 3;
    }
}
