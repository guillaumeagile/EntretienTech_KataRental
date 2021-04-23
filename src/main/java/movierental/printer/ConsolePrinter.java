package movierental.printer;

import movierental.Customer;
import movierental.Rental;

public class ConsolePrinter {

    public static String print(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getPriceToPay();
            frequentRenterPoints += rental.getFrequentRenterPoints();

            // show figures for this rental
            result.append("\t")
                    .append(rental.getMovieTitle())
                    .append("\t")
                    .append(thisAmount)
                    .append("\n");
            totalAmount += thisAmount;
        }

        // add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }
}
