package movierental;

public abstract class Movie {

    private final String _title;

    public Movie(String title) {
        _title = title;
    }

    String getTitle() {
        return _title;
    }
    abstract double getPriceForDuration(int days);
    abstract int getFrequentRenterPoints(int days);
}
