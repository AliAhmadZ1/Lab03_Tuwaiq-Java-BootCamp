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
        user.setPurchaseMediaList(new Media[0]);
    }
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        if (movieCatalog.contains(this.getAuteur())) {
            movieCatalog.add(this);
            return movieCatalog;
        }
        else {
            System.out.println("this not from same auteur!!");
            return movieCatalog;
        }
    }


    @Override
    public String getMediaType() {
        if (this.getDuration()>=120)
        return "Long Movie";
        else
            return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
