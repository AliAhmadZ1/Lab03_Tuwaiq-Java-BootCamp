import java.util.ArrayList;

public class Movie extends Media{
    private int duration;

    //constructors
    public Movie() {
    }
    public Movie(int duration) {
        this.duration = duration;
    }
    public Movie(String title, String auteur, String isbn, double price, int duration) {
        super(title, auteur, isbn, price);
        this.duration = duration;
    }

    //setter
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //getter
    public int getDuration() {
        return duration;
    }

    //methods
    public void watch(User user){
        System.out.println("enjoy watching...");
    }
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        if (getTitle().length()==5)
            return movieCatalog;
        else
            return null;
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
