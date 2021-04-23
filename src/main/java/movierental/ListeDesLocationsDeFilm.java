package movierental;

import java.util.ArrayList;

public class ListeDesLocationsDeFilm extends ArrayList<LocationDeFilm> {

    private double montantTotal = 0;

    private int pointDeFidelite = 0;

    public void ajouter(LocationDeFilm location) {
        this.add(location);

        this.montantTotal += location.calculerMontant();

        this.pointDeFidelite += location.calculerNombreDePointsDeFidelite();
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public int getPointDeFidelite() {
        return pointDeFidelite;
    }
}
