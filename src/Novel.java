public class Novel extends Book {
    private String genre;

    //constructors
    public Novel() {
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(int stock, Review[] review, String genre) {
        super(stock, review);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String isbn, double price, int stock, Review[] review, String genre) {
        super(title, auteur, isbn, price, stock, review);
        this.genre = genre;
    }

    //setter
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //getter
    public String getGenre() {
        return genre;
    }

    //methods


    @Override
    public String getMediaType() {
        if (super.getAverageRating() >= 4.5)
            return "Bestselling Novel";
        else
            return "Novel";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
