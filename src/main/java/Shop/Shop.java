package Shop;

import Instruments.Instrument;
import Stock.Accessories;
import Stock.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public void addStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public double calculateProfit(){
        double total = 0;
        for (ISell stock : this.stock){
            if (stock instanceof Instrument){
               total += stock.calculateMarkUp() * ((Instrument) stock).getBuyingPrice();
            } else if (stock instanceof Accessories){
                total += stock.calculateMarkUp() * ((Accessories) stock).getBuyingPrice();
            }
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }
}
