public abstract class News {
    String headline;
    String text;
    double score;
    double price;
/*
    public News(String headline, String text, double score, double price) {
        this.headline = headline;
        this.text = text;
        this.score = score;
        this.price = price;
    }
*/
    enum Sports {
        FOOTBALL,
        BASKETBALL,
        TENNIS,
        F1,
        MOTORCYCLING
    }

    public abstract double calculatePriceNews();

}
