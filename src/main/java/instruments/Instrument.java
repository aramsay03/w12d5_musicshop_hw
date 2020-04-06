package instruments;

import shop.ISell;

public abstract class Instrument implements ISell {

    protected String manufacturer;
    protected String instrumentFamily;
    protected String colour;
    protected double costPrice;
    protected double retailPrice;

     public Instrument(String manufacturer, String instrumentFamily, String colour, double costPrice, double retailPrice) {
        this.manufacturer = manufacturer;
        this.instrumentFamily = instrumentFamily;
        this.colour = colour;
        this.costPrice = costPrice;
        this.retailPrice = 0;
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

    public double getCostPrice() {
         return costPrice;
    }

    public double getRetailPrice() {
         return retailPrice;
    }

}
