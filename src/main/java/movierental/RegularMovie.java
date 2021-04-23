package movierental;

public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getPriceForDuration(int days) {
        double price = 2D;
        if (days > 2) {
            price += (days - 2) * 1.5D;
        }
        return price;
    }

    @Override
    int getFrequentRenterPoints(int days) {
        return 1;
    }
}
