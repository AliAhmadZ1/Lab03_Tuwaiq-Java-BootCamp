import java.util.Arrays;

public class User {
    private String username;
    private String email;
    private Media[] purchaseMediaList;
    private Media[] shoppingCart;

    //constructors
    public User(){

    }
    public User(String username, String email, Media[] purchaseMediaList, Media[] shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    //setters
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPurchaseMediaList(Media[] purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }
    public void setShoppingCart(Media[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    //getters
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public Media[] getPurchaseMediaList() {
        return purchaseMediaList;
    }
    public Media[] getShoppingCart() {
        return shoppingCart;
    }

    //methods
    public void addToCart(Media media){
//        for (int i = 0; i < shoppingCart.length; i++) {
//            if (shoppingCart==null) {
                shoppingCart = new Media[]{media};
//            }
//        }
    }
    public void removeFromCart(Media media){
        for (int i = 0; i < getShoppingCart().length; i++) {
            if (shoppingCart[i]==media)
                shoppingCart[i] = null;
        }
    }
    public void checkOut(){
        setPurchaseMediaList(getShoppingCart());
        setShoppingCart(null);
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + Arrays.toString(purchaseMediaList) +
                ", shoppingCart=" + Arrays.toString(shoppingCart) +
                '}';
    }
}
