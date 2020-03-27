package Stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {

    private GuitarPick guitarPick;

    @Before
    public void before(){
        guitarPick = new GuitarPick("Guitar Pick", 2, 5);
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar Pick", guitarPick.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(2, guitarPick.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(5, guitarPick.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(1.5, guitarPick.calculateMarkUp(),0.01);
    }
}
