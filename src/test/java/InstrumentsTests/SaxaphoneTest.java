package InstrumentsTests;

import instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void setUp() {
        saxaphone = new Saxaphone("Tennor", "Brass");
    }

    @Test
    public void canGetType() {
        assertEquals("Tennor", saxaphone.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxaphone.getMaterial());
    }

}
