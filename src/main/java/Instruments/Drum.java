package Instruments;

import Stock.ISell;

public class Drum extends Instrument implements IPlay, ISell {

    private int numOfParts;

    public Drum(String material, String colour, int numOfParts, double buyingPrice, double sellingPrice){
        super(material, colour, InstrumentType.Percussion, buyingPrice, sellingPrice);
        this.numOfParts = numOfParts;
    }

    public int getNumOfParts() {
        return numOfParts;
    }

    public String playInstrument(){
        return "Ba dum tss";
    }

    public double calculateMarkUp(){
        return (getSellingPrice()-getBuyingPrice())/getBuyingPrice();
    }
}
