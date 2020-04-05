package InstrumentsTests;

import instruments.Guitar;
import instruments.Instrument;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Test
    public void canGetSuperClassElementsGuitar() {
        instrument = new Guitar("Fender","String","Red","Electric Bass", 4, "Varnished Oak");
        assertEquals("Fender", instrument.getManufacturer());
        assertEquals("String", instrument.getInstrumentFamily());
        assertEquals("Red", instrument.getColour());
    }

}
