public class AcademicBook extends Book {
    private String subject;

    //constructors
    public AcademicBook() {

    }
    public AcademicBook(String subject) {
        this.subject = subject;
    }
    public AcademicBook(int stock, Review[] review, String subject) {
        super(stock, review);
        this.subject = subject;
    }
    public AcademicBook(String title, String auteur, String isbn, double price, int stock, Review[] review, String subject) {
        super(title, auteur, isbn, price, stock, review);
        this.subject = subject;
    }

    //setter
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //getter
    public String getSubject() {
        return subject;
    }

    //methods


    @Override
    public String getMediaType() {
        return super.getMediaType();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
