package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Tan", "Electric", "Fender", 200, 400);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Tan", guitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.String, guitar.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getGuitarType());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(200, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(400, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(1, guitar.calculateMarkUp(), 0.01);
    }
}
