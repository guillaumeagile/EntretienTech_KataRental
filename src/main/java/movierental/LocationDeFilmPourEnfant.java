package movierental;

public class LocationDeFilmPourEnfant extends LocationDeFilm {

    private final double montant;

    private final int pointDeFidelite;

    public LocationDeFilmPourEnfant(Film film, int daysRented) {
        super(film);
        this.montant = calculerMontant(daysRented);
        this.pointDeFidelite = calculerPointDeFidelite();
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
        double montant = 1.5;

        if (daysRented > 3) {
            montant += (daysRented - 3) * 1.5;
        }
        return montant;
    }

    public int calculerPointDeFidelite() {
        return 1;
    }
}
