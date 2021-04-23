package movierental;

public class Client {

    private final String nom;

    private final ListeDesLocationsDeFilm locationDeFilms = new ListeDesLocationsDeFilm();

    private final SystemeDeTarification systemeDeTarification;

    private final SystemeDeFidelisation systemeDeFidelisation;

    public Client(String nom, SystemeDeTarification systemeDeTarification, SystemeDeFidelisation systemeDeFidelisation) {
        this.nom = nom;
        this.systemeDeTarification = systemeDeTarification;
        this.systemeDeFidelisation = systemeDeFidelisation;
    }

    public void ajouterUneLocation(Film film, int duree) {
        Tarification tarification = systemeDeTarification.calculerTarification(film);

        Fidelisation fidelisation = systemeDeFidelisation.calculerFidelisation(film);

        locationDeFilms.ajouter(new LocationDeFilm(film, tarification, fidelisation, duree));
    }

    public String getNom() {
        return nom;
    }

    public ListeDesLocationsDeFilm getListeDesLocationsDeFilm() {
        return locationDeFilms;
    }
}
