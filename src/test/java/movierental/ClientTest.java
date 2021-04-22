package movierental;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ClientTest {

    private Client client;

    @Before
    public void before() {
        client = new Client("Bob");
        client.ajouter(new LocationDeFilmClassique(new Film("Jaws"), 2));
        client.ajouter(new LocationDeFilmClassique(new Film("Golden Eye"), 3));
        client.ajouter(new LocationDeFilmRecent(new Film("Short New"), 1));
        client.ajouter(new LocationDeFilmRecent(new Film("Long New"), 2));
        client.ajouter(new LocationDeFilmPourEnfant(new Film("Bambi"), 3));
        client.ajouter(new LocationDeFilmPourEnfant(new Film("Toy Story"), 4));
    }

    @Test
    public void test_d_affichage_du_client() {
        String expected = "" +
                "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";

        ServiceAffichageDuClient serviceAffichageDuClient = new ServiceAffichageDuClient(client);

        assertEquals(expected, serviceAffichageDuClient.calculer());
    }

    @Test
    public void test_d_affichage_du_client_en_HTML() {
        String expected = "" +
            "<h1>Rental Record for <em>Bob</em><h1>\n" +
            "<table>\n" +
            "<tr><td>Jaws</td><td>2.0</tr>\n" +
            "<tr><td>Golden Eye</td><td>3.5</tr>\n" +
            "<tr><td>Short New</td><td>3.0</tr>\n" +
            "<tr><td>Long New</td><td>6.0</tr>\n" +
            "<tr><td>Bambi</td><td>1.5</tr>\n" +
            "<tr><td>Toy Story</td><td>3.0</tr>\n" +
            "</table>\n" +
            "<p>Amount owed is <em>19.0</em></p>\n" +
            "<p>You earned <em>7</em> frequent renter points</p>";

        ServiceAffichageDuClient serviceAffichageDuClient = new ServiceAffichageDuClient(client);

        assertEquals(expected, serviceAffichageDuClient.calculerHTML());
    }
}