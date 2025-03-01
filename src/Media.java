public class Media {
    private String title;
    private String auteur;
    private String isbn;
    private double price;

    //constructors
    public Media() {
    }

    public Media(String title, String auteur, String isbn, double price) {
        this.title = title;
        this.auteur = auteur;
        this.isbn = isbn;
        this.price = price;
    }

    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getters

    public String getTitle() {
        return title;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    //methods
    public String getMediaType(){
        return "Media:"; // /*-++*/*-+-*/*-+-*/*-+-*/*-+
    }


    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                '}';
    }
}
