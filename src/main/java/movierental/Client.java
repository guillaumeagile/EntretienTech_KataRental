package movierental;

public class Client {

    private final String nom;

    private final ListeDesLocationsDeFilm locationDeFilms = new ListeDesLocationsDeFilm();

    public Client(String nom) {
        this.nom = nom;
    }

    public void ajouter(LocationDeFilm locationDeFilm) {
        locationDeFilms.ajouter(locationDeFilm);
    }

    public String getNom() {
        return nom;
    }

    public ListeDesLocationsDeFilm getListeDesLocationsDeFilm() {
        return locationDeFilms;
    }
}
