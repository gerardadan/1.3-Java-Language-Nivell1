public class SportNews extends News{
    String competition;
    String team;
    String player;

    public SportNews(String title, double score, double price) {
        super(title, score, price);
    }

    public void setNewsText(String text){
        this.text = text;
    }

    @Override
    public double calculatePriceNews(){
        double price = 0;

        return price;
    }
}
