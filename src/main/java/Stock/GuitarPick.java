package Stock;

public class GuitarPick extends Accessories implements ISell {

    public GuitarPick(String description, double buyingPrice, double sellingPrice){
        super(description, buyingPrice, sellingPrice);
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }
}
