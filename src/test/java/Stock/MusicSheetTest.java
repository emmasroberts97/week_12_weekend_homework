package Stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    private MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("Music Sheet", 2, 5);
    }

    @Test
    public void hasDescription(){
        assertEquals("Music Sheet", musicSheet.getDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(2, musicSheet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(5, musicSheet.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(1.5, musicSheet.calculateMarkUp(),0.01);
    }
}
