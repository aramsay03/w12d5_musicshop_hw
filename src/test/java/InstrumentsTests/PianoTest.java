package InstrumentsTests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Yamaha", "Piano","Black", 56700,"Grand Piano", 88);
    }

    @Test
    public void canGetType() {
        assertEquals("Grand Piano", piano.getType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetSoundPlayed() {
        assertEquals("Sound if a piano", piano.play());
    }

    @Test
    public void canGetSuperClassElements() {
        assertEquals("Yamaha", piano.getManufacturer());
        assertEquals("Piano", piano.getInstrumentFamily());
        assertEquals("Black", piano.getColour());
    }

}
