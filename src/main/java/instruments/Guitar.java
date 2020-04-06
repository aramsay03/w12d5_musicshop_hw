package instruments;


public class Guitar extends Instrument implements IPlay {

    private String type;
    private int numberOfStrings;
    private String material;

    public Guitar(String manufacturer, String instrumentFamily, String colour, double costPrice, String type, int numberOfStrings, String material) {
        super(manufacturer, instrumentFamily, colour, costPrice, 0);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getMaterial() {
        return material;
    }

    public String play() {
        return "Sound of a guitar";
    }

    public double calculateMarkup(double costPrice) {
        return super.retailPrice = costPrice * markup;
    }

}
