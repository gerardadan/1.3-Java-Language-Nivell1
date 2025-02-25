public abstract class News {
    String headline;
    String text;
    double score;
    double price;

    public News(String headline, String text, double score, double price) {
        this.headline = headline;
        this.text = text;
        this.score = score;
        this.price = price;
    }

    public abstract double calculatePriceNews();

}
