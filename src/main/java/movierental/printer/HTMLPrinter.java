package movierental.printer;

import movierental.Customer;
import movierental.Rental;

public class HTMLPrinter {

    public static String print(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("<h1>Rental Record for <em>" + customer.getName() + "</em><h1>\n");
        result.append("<table>\n");

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getPriceToPay();
            frequentRenterPoints += rental.getFrequentRenterPoints();

            // show figures for this rental
            result.append("<tr><td>")
                    .append(rental.getMovieTitle())
                    .append("</td><td>")
                    .append(thisAmount)
                    .append("</tr>\n");
            totalAmount += thisAmount;
        }
        result.append("</table>\n");

        // add footer lines
        result.append("<p>Amount owed is <em>").append(totalAmount).append("</em></p>\n");
        result.append("<p>You earned <em>").append(frequentRenterPoints).append("</em> frequent renter points</p>");

        return result.toString();
    }
}
