package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before(){
        drum = new Drum("Wood", "Black", 5, 100, 500);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", drum.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.Percussion, drum.getType());
    }

    @Test
    public void hasNumOfParts(){
        assertEquals(5, drum.getNumOfParts());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(100, drum.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500, drum.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(4, drum.calculateMarkUp(), 0.01);
    }
}
