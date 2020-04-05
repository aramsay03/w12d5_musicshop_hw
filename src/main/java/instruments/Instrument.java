package instruments;

public abstract class Instrument {

    protected String manufacturer;
    protected String instrumentFamily;
    protected String colour;

     public Instrument(String manufacturer, String instrumentFamily, String colour) {
        this.manufacturer = manufacturer;
        this.instrumentFamily = instrumentFamily;
        this.colour = colour;
     }

    public String getManufacturer() {
         return manufacturer;
    }

    public String getInstrumentFamily() {
         return instrumentFamily;
    }

    public String getColour() {
         return colour;
    }

}
