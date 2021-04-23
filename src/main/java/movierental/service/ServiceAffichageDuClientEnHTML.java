package movierental.service;

import movierental.Client;
import movierental.LocationDeFilm;

public class ServiceAffichageDuClientEnHTML {
    private final Client client;

    public ServiceAffichageDuClientEnHTML(Client client) {
        this.client = client;
    }

    public String calculerHTML() {
        String result = "<h1>Rental Record for <em>" + client.getNom() + "</em><h1>\n";
        result += "<table>\n";

        for(LocationDeFilm locationDeFilm : client.getListeDesLocationsDeFilm()) {
            result += "<tr><td>" + locationDeFilm.getTitreDeFilm() + "</td><td>" + locationDeFilm.calculerMontant() + "</tr>\n";
        }

        result += "</table>\n";

        // add footer lines
        result += "<p>Amount owed is <em>" + client.getListeDesLocationsDeFilm().getMontantTotal() + "</em></p>\n";
        result += "<p>You earned <em>" + client.getListeDesLocationsDeFilm().getPointDeFidelite() + "</em> frequent renter points</p>";

        return result;
    }
}
