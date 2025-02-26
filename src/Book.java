

public class Book extends Media{

    private int stock;
    private Review[] review;

    //constructor
    public Book() {
    }

    public Book(int stock, Review[] review) {
        this.stock = stock;
        this.review = review;
    }

    public Book(String title, String auteur, String isbn, double price, int stock, Review[] review) {
        super(title, auteur, isbn, price);
        this.stock = stock;
        this.review = review;
    }

    //setters

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReview(Review[] review) {
        this.review = review;
    }

    //getters

    public int getStock() {
        return stock;
    }

    public Review[] getReview() {
        return review;
    }

    //methods
    public void addReview(Review r){
        for (int i = 0; i < getReview().length; i++) {
            if (review[i]==null) {
                review[i] = r;
                break;
            }
        }
    }
    public double getAverageRating(){
        double sum=0;
        double average = 0;
        for (int i = 0; i < review.length; i++) {
             sum += review[i].getRating();
        }
        average = sum/review.length+1;
        return average;
    } //*************************************************************************************************
    public void purchase(User user){
        if (stock==0)
            System.out.println("Unfortunately is out of stock! /-_-\\");
        else
            System.out.println("Enjoy reading. *_*");
    }
    public boolean isBestSeller(){
     return getAverageRating()>=4.5;
    } //*************************************************************************************************

    public void restock(int quantity){
        this.stock += quantity;
    }


    @Override
    public String getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
