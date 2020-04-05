package instruments;

public class Piano extends Instrument implements IPlay {

    private String type;
    private int numberOfKeys;

    public Piano(String manufacturer, String instrumentFamily, String colour, String type, int numberOfKeys) {
        super(manufacturer, instrumentFamily, colour);
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
}
