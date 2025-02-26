import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lab 3 Tuwaiq Java bootCamp");
        System.out.println("Ali Ahmed Alshehri");
        System.out.println("=====================================");
        //---------------------------------------------------------------------

        User[] user = new User[5];
        Media[] media = new Media[10];
        Review[] review = new Review[20];
        ArrayList<Music> generalPlayListM = new ArrayList<Music>();

        System.out.println("Store ---------------------->");
        Store s1 =new Store(user,media);


        System.out.println("User ---------------------->");
        User u1 = new User();
        u1.setEmail("ali@gmail.com");
        u1.setUsername("ali ahmed");
        System.out.println(u1.toString());
//        user[0] = u1;
        s1.addUser(u1);
        System.out.println(Arrays.toString(user));
        User u2 = new User();
        u2.setEmail("moh@gmail.com");
        u2.setUsername("mohammed");
        System.out.println(u2.toString());
//        user[1] = u2;
        s1.addUser(u2);
        System.out.println(Arrays.toString(user));


        System.out.println("Media ---------------------->");
        Media m1 = new Media();
        m1.setAuteur("Jafer ");
        m1.setIsbn("9781234567897");
        m1.setPrice(34.25);
        m1.setTitle("Aqwamu Quilan");
//        media[0] = m1;
        s1.addMedia(m1);
        System.out.println(m1.toString());
        System.out.println(Arrays.toString(media));

        System.out.println("Review ---------------------->");
        Review r1 = new Review();
        r1.setUsername(u1.getUsername());
        r1.setComment("beautiful!!");
        r1.setRating(4);
        review[0] = r1;
        System.out.println(r1.toString());
        System.out.println(Arrays.toString(review));

        System.out.println("Book ---------------------->");
        Book b1 = new Book();
        b1.setAuteur("Saeed ");
        b1.setIsbn("9781234500897");
        b1.setTitle("big goal");
        b1.setPrice(374.99);
        b1.setStock(2);
        b1.setReview(review);
//        media[1]=b1;
        s1.addMedia(b1);
        System.out.println(b1.toString());

        System.out.println("Movie ---------------------->");
        Movie mv1= new Movie();
        mv1.setAuteur("tagg");
        mv1.setIsbn("34985512");
        mv1.setPrice(12.75);
        mv1.setTitle("Natural gate");
        mv1.setDuration(135);
//        media[2]=mv1;
        s1.addMedia(mv1);
        System.out.println(mv1.toString());

        System.out.println("Music ---------------------->");
        Music ms1 =new Music();
        ms1.setAuteur("eeeq");
        ms1.setIsbn("34988457");
        ms1.setPrice(5);
        ms1.setTitle("story of camel");
        ms1.setArtist("qzc");
//        media[3]= ms1;
        s1.addMedia(ms1);
        System.out.println(ms1.toString());

        System.out.println("Novel ---------------------->");
        Novel n1 = new Novel();
        n1.setAuteur("fert");
        n1.setIsbn("1548795");
        n1.setGenre("magic");
        n1.setPrice(174);
        n1.setTitle("the bird & its doctor");
        n1.setStock(4);
        n1.setReview(review);
//        media[4]=n1;
        s1.addMedia(n1);
        System.out.println(n1.toString());

        System.out.println("Academic Book ---------------------->");
        AcademicBook a1 = new AcademicBook();
        a1.setAuteur("ali");
        a1.setIsbn("1648585");
        a1.setSubject("mathematics");
        a1.setPrice(163);
        a1.setTitle("Arrays with algebra operations");
        a1.setStock(4);
        a1.setReview(review);
//        media[5]=a1;
        s1.addMedia(a1);
        System.out.println(a1.toString());

        System.out.println("************************************");
//        System.out.println(s1.toString());
        System.out.println(Arrays.toString(s1.displayUsers()));
        System.out.println(Arrays.toString(s1.displayMedias()));
        System.out.println(s1.searchBook("big goal"));
        //*-----------**-------------------------------------------------
        u1.addToCart(mv1);
        System.out.println(u1.toString());
        u1.removeFromCart(mv1);
        System.out.println(u1.toString());

        u1.addToCart(mv1);
        u1.addToCart(ms1);
        u1.addToCart(a1);
        System.out.println(u1.toString());
        u1.checkOut();
        System.out.println(u1.toString());

        System.out.println(m1.getMediaType());

        ms1.listen(u2);
        generalPlayListM.add(ms1);
        ms1.generalPlayList(generalPlayListM);

        b1.addReview(r1);
        b1.purchase(u1);
        b1.restock(9);
//        System.out.println(b1.getAverageRating());

        mv1.watch(u1);

//        mv1.recommendSimilarMovies();




    }
}