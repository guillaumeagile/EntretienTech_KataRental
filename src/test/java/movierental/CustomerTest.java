package movierental;

import movierental.printer.ConsolePrinter;
import movierental.printer.HTMLPrinter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Bob");
        customer.addRental(new Rental(new RegularMovie("Jaws"), 2));
        customer.addRental(new Rental(new RegularMovie("Golden Eye"), 3));
        customer.addRental(new Rental(new NewMovie("Short New"), 1));
        customer.addRental(new Rental(new NewMovie("Long New"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Bambi"), 3));
        customer.addRental(new Rental(new ChildrenMovie("Toy Story"), 4));
    }

    @Test
    public void testConsole() {
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

        assertEquals(expected, ConsolePrinter.print(customer));
    }

    @Test
    public void testHTML() {
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

        assertEquals(expected, HTMLPrinter.print(customer));
    }
}