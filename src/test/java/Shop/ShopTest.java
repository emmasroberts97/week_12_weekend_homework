package Shop;

import Instruments.Drum;
import Instruments.Piano;
import Stock.GuitarPick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Drum drum;
    private GuitarPick guitarPick;
    private Piano piano;

    @Before
    public void before(){
        shop = new Shop("Emma's Shop");
        drum = new Drum("Wood", "Black", 5, 100, 500);
        guitarPick = new GuitarPick("Guitar Pick", 2, 5);
        piano = new Piano("Wood", "Black", "Bösendorfer", 600, 1500);
    }

    @Test
    public void hasName(){
        assertEquals("Emma's Shop", shop.getName());
    }

    @Test
    public void hasEmptyStock(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStock(){
        shop.addStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(piano);
        shop.addStock(guitarPick);
        shop.removeStock(piano);

        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculateProfit(){
        shop.addStock(piano);
        shop.addStock(guitarPick);
        shop.addStock(drum);

        assertEquals(1303, shop.calculateProfit(), 0.01);
    }
}
