package Stock;

public class DrumStick extends Accessories implements ISell{

    public DrumStick(String description, double buyingPrice, double sellingPrice){
        super(description, buyingPrice, sellingPrice);
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }
}
