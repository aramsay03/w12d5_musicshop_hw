package instruments;

import shop.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private String type;
    private int numberOfKeys;

    public Piano(String manufacturer, String instrumentFamily, String colour, double costPrice, String type, int numberOfKeys) {
        super(manufacturer, instrumentFamily, colour, costPrice,0);
        this.type = type;
        this.numberOfKeys = numberOfKeys;
    }

    public String getType() {
        return this.type;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String play() {
        return "Sound if a piano";
    }

    public void calculateMarkup(double costPrice) {
        super.retailPrice = costPrice * markup;
    }
}
