package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood", "Black", "Bösendorfer", 600, 1500);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.Chordophones, piano.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Bösendorfer", piano.getBrand());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(600, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1500, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(1.5, piano.calculateMarkUp(), 0.01);
    }
}
