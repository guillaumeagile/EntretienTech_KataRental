package movierental;

public class LocationDeFilm implements Location {

    private final Film film;

    private final Tarification tarification;

    private final Fidelisation fidelisation;

    private final int duree;

    public LocationDeFilm(Film film, Tarification tarification, Fidelisation fidelisation, int duree) {
        this.film = film;
        this.tarification = tarification;
        this.fidelisation = fidelisation;
        this.duree = duree;
    }

    public String getTitreDeFilm() {
        return film.getTitre();
    }

    @Override
    public double calculerMontant() {
        return tarification.calculerMontant(duree);
    }

    @Override
    public int calculerNombreDePointsDeFidelite() {
        if(fidelisation instanceof FidelisationFixe) {
            return ((FidelisationFixe) fidelisation).calculerPointDeFidelite();
        }
        else {
            return ((FidelisationVariable) fidelisation).calculerPointDeFidelite(duree);
        }
    }
}
