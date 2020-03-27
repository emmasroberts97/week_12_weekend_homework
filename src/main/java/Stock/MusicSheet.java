package Stock;

public class MusicSheet extends Accessories implements ISell{

    public MusicSheet(String description, double buyingPrice, double sellingPrice){
        super(description, buyingPrice, sellingPrice);
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }
}
