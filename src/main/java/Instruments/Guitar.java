package Instruments;

import Stock.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private String guitarType;
    private String brand;

    public Guitar(String material, String colour, String guitarType, String brand, double buyingPrice, double sellingPrice){
        super(material, colour, InstrumentType.String, buyingPrice, sellingPrice);
        this.guitarType = guitarType;
        this.brand = brand;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public String getBrand() {
        return brand;
    }

    public String playInstrument(){
        return "Waaa waaa";
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }


}
