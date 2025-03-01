import java.util.List;

public class Music extends Media{
    private String artist;

    //constructor
    public Music() {
    }

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String isbn, double price, String artist) {
        super(title, auteur, isbn, price);
        this.artist = artist;
    }

    //setters
    public void setArtist(String artist) {
        this.artist = artist;
    }

    //getters
    public String getArtist() {
        return artist;
    }

    //methods
    public void listen(User user){
        System.out.println("listening...");
    }
    public List<Music> generalPlayList(List<Music> musicCatalog){
        if (musicCatalog.contains(this.getAuteur())) {
            musicCatalog.add(this);
            return musicCatalog;
        }else {
            System.out.println("not same auteur.");
            return musicCatalog;
        }
    }


    @Override
    public String getMediaType() {
        if (this.getPrice()>=10)
        return "Premium Music";
        else
            return "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
