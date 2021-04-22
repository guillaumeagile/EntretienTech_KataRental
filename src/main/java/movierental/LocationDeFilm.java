package movierental;

public abstract class LocationDeFilm implements Location {

    private final Film film;

    public LocationDeFilm(Film film) {
        this.film = film;
    }

    public String getTitreDeFilm() {
        return film.getTitre();
    }
}
