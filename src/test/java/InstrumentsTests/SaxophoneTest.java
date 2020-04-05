package InstrumentsTests;

import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Tenor", "Brass");
    }

    @Test
    public void canGetType() {
        assertEquals("Tenor", saxophone.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canGetSoundPlayed() {
        assertEquals("Sound of a saxophone", saxophone.play());
    }

}
