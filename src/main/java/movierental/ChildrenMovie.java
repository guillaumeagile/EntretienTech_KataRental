package movierental;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getPriceForDuration(int days) {
        double price = 1.5D;
        if (days > 3) {
            price += (days - 3) * 1.5D;
        }
        return price;
    }

    @Override
    int getFrequentRenterPoints(int days) {
        return 1;
    }
}
