package movierental.service;

import movierental.Client;
import movierental.LocationDeFilm;

public class ServiceAffichageDuClient {
    private final Client client;

    public ServiceAffichageDuClient(Client client) {
        this.client = client;
    }

    public String calculer() {
        String result = "Rental Record for " + client.getNom() + "\n";

        for(LocationDeFilm locationDeFilm : client.getListeDesLocationsDeFilm()) {
            result += "\t" + locationDeFilm.getTitreDeFilm() + "\t" + locationDeFilm.calculerMontant() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + client.getListeDesLocationsDeFilm().getMontantTotal() + "\n";
        result += "You earned " + client.getListeDesLocationsDeFilm().getPointDeFidelite() + " frequent renter points";

        return result;
    }
}
