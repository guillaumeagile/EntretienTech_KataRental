package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private final Movie _movie;
    private final int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public String getMovieTitle() {
        return _movie.getTitle();
    }
    public double getPriceToPay() {
        return _movie.getPriceForDuration(_daysRented);
    }
    public double getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
