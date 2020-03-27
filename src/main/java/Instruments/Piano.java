package Instruments;

import Stock.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String brand;

    public Piano(String material, String colour, String brand, double buyingPrice, double sellingPrice){
        super(material, colour, InstrumentType.Chordophones, buyingPrice, sellingPrice);
        this.brand = brand;
    }

    public String playInstrument(){
        return "Tinkle tinkle tinkle";
    }

    public String getBrand() {
        return brand;
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }
}
