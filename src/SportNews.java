public class SportNews extends News{
    String competition;
    String team;
    String player;
/*
    public SportNews(String headline, String text, double score, double price) {
        super(headline, text, score, price);
    }
*/
    enum Sports {
        FOOTBALL,
        BASKETBALL,
        TENNIS,
        F1,
        MOTORCYCLING
    }

    @Override
    public double calculatePriceNews(){
        double price = 0;

        return price;
    }
}
