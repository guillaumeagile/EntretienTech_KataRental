package movierental;

public class ServiceAffichageDuClient {
    private final Client client;

    public ServiceAffichageDuClient(Client client) {
        this.client = client;
    }

    public String calculer() {
        String result = "Rental Record for " + client.getNom() + "\n";

        for(LocationDeFilm locationDeFilm : client.getListeDesLocationsDeFilm()) {
            result += "\t" + locationDeFilm.getTitreDeFilm() + "\t" + locationDeFilm.getMontant() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + client.getListeDesLocationsDeFilm().getMontantTotal() + "\n";
        result += "You earned " + client.getListeDesLocationsDeFilm().getPointDeFidelite() + " frequent renter points";

        return result;
    }

    public String calculerHTML() {
        String result = "<h1>Rental Record for <em>" + client.getNom() + "</em><h1>\n";
        result += "<table>\n";

        for(LocationDeFilm locationDeFilm : client.getListeDesLocationsDeFilm()) {
            result += "<tr><td>" + locationDeFilm.getTitreDeFilm() + "</td><td>" + locationDeFilm.getMontant() + "</tr>\n";
        }

        result += "</table>\n";

        // add footer lines
        result += "<p>Amount owed is <em>" + client.getListeDesLocationsDeFilm().getMontantTotal() + "</em></p>\n";
        result += "<p>You earned <em>" + client.getListeDesLocationsDeFilm().getPointDeFidelite() + "</em> frequent renter points</p>";

        return result;
    }
}
