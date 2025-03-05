public abstract class News {
    private String title;
    protected String text;
    private double score;
    private double price;

    public News(String title, double score, double price) {
        this.title = title;
        this.text = null;
        this.score = score;
        this.price = price;
    }

    public abstract void setNewsText(String text);

    public abstract double calculatePriceNews();

}
