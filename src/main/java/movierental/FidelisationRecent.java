package movierental;

public class FidelisationRecent implements FidelisationVariable {

    public int calculerPointDeFidelite(int dureeDeLocation) {
        int frequentRenterPoints = 1;
        if (dureeDeLocation > 1)
            frequentRenterPoints++;

        return frequentRenterPoints;
    }
}
