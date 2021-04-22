package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    //TODO: remplacer cette liste par un type(classe) qui permette de calculer le montant
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            double thisAmount = 0;

            thisAmount = determinerMontant(each, thisAmount);

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            frequentRenterPoints = calculateFrequentRenterPoints(frequentRenterPoints, each);

            // show figures for this rental  TODO: separer le "rendu" du métier
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }

    private int calculateFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private  double determinerMontant(Rental each, double thisAmount) {
      //TODO: virer le switch et extraire des types de films
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}
