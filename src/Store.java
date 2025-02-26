import java.util.Arrays;

public class Store {
    private User[] user;
    private Media[] media;

    //constructors
    public Store(){

    }
    public Store(User[] user, Media[] media) {
        this.user = user;
        this.media = media;
    }

    //setters
    public void setUser(User[] user) {
        this.user = user;
    }
    public void setMedia(Media[] media) {
        this.media = media;
    }

    //getters
    public User[] getUser() {
        return user;
    }
    public Media[] getMedia() {
        return media;
    }

    //methods
    public void addUser(User user){
        for (int i = 0; i < getUser().length; i++) {
            if (getUser()[i]==null) {
                getUser()[i] = user;
            break;
            }
        }
    }
    public User[] displayUsers(){
        return getUser();
    }
    public void addMedia(Media media){
        for (int i = 0; i < getMedia().length; i++) {
            if (this.media[i]==null) {
                this.media[i] = media;
                break;
            }
        }
    }
    public Media[] displayMedias(){
        return getMedia();
    }
    //*************
    public Book searchBook(String title){
        for (int i = 0; i < media.length; i++) {
            if (media[i].getTitle().equals(title)) {
                return (Book) media[i];
            }
        }
        return null;
    }
    //**************


    @Override
    public String toString() {
        return "Store{" +
                "user=" + Arrays.toString(user) +
                "\nmedia=" + Arrays.toString(media) +
                '}';
    }
}