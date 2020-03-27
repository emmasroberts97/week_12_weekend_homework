package Stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    private DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick("Drum Stick", 2, 5);
    }

    @Test
    public void hasDescription(){
        assertEquals("Drum Stick", drumStick.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(2, drumStick.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(5, drumStick.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(1.5, drumStick.calculateMarkUp(),0.01);
    }
}
