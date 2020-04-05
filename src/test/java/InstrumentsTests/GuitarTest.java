package InstrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Electric Bass", 4, "Varnished Oak");
    }

    @Test
    public void canGetType() {
        assertEquals("Electric Bass", guitar.getType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Varnished Oak", guitar.getMaterial());
    }

}
