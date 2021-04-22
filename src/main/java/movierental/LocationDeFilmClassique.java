package movierental;

public class LocationDeFilmClassique extends LocationDeFilm {

    private final double montant;

    private final int pointDeFidelite;

    public LocationDeFilmClassique(Film film, int daysRented) {
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
        double montant = 2;

        if(daysRented > 2) {
            montant += (daysRented - 2) * 1.5;
        }
        return montant;
    }

    private int calculerPointDeFidelite() {
        return 1;
    }
}
