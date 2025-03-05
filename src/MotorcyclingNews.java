public class MotorcyclingNews extends SportNews{

    public MotorcyclingNews(String title,  double score, double price) {
        super(title, score, price);
    }

    @Override
    public double calculatePriceNews() {
        return 0;
    }
}
