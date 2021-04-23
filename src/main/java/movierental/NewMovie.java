package movierental;

public class NewMovie extends Movie {

    public NewMovie(String title) {
        super(title);
    }

    @Override
    public double getPriceForDuration(int days) {
        return days * 3D;
    }

    @Override
    int getFrequentRenterPoints(int days) {
        int points = 1;
        if (days > 1) {
            points++;
        }
        return points;
    }
}
