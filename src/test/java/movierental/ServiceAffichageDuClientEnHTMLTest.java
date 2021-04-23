package movierental;

import movierental.service.ServiceAffichageDuClientEnHTML;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ClientResolver.class)
public class ServiceAffichageDuClientEnHTMLTest {

    @Test
    public void test_d_affichage_du_client_en_HTML(Client client) {
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

        ServiceAffichageDuClientEnHTML serviceAffichageDuClient = new ServiceAffichageDuClientEnHTML(client);

        assertEquals(expected, serviceAffichageDuClient.calculerHTML());
    }
}