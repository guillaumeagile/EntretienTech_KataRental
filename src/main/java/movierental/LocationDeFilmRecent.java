package movierental;

public class LocationDeFilmRecent extends LocationDeFilm {

    private final double montant;

    private final int pointDeFidelite;

    public LocationDeFilmRecent(Film film, int daysRented) {
        super(film);
        this.montant = calculerMontant(daysRented);
        this.pointDeFidelite = calculerPointDeFidelite(daysRented);
    }

    @Override
    public String getTitreDeFilm() {
        return super.getTitreDeFilm();
    }

    public double getMontant() {
        return montant;
    }

    public int getPointDeFidelite() {
        return pointDeFidelite;
    }

    private double calculerMontant(int daysRented) {
        return daysRented * 3;
    }

    private int calculerPointDeFidelite(int daysRented) {
        int frequentRenterPoints = 1;
        if (daysRented > 1)
            frequentRenterPoints++;

        return frequentRenterPoints;
    }
}
