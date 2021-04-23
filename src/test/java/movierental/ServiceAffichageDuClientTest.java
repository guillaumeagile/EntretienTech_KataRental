package movierental;

import movierental.service.ServiceAffichageDuClient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ClientResolver.class)
public class ServiceAffichageDuClientTest {

    @Test
    public void test_d_affichage_du_client(Client client) {
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
}