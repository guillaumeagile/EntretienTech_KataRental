package movierental;

public class FidelisationRecent implements FidelisationVariable {

    public int calculerPointDeFidelite(int dureeDeLocation) {
        return Math.min( 2, dureeDeLocation);
    }
}
