package instruments;

public class Saxophone extends Instrument implements IPlay {

    private String type;
    private String material;

    public Saxophone(String manufacturer, String instrumentFamily, String colour, String type, String material) {
        super(manufacturer, instrumentFamily, colour);
        this.type = type;
        this.material = material;
    }


    public String getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }

    public String play() {
        return "Sound of a saxophone";
    }
}
