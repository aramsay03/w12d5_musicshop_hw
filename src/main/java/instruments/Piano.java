package instruments;

public class Piano implements IPlay {

    private String type;
    private int numberOfKeys;

    public Piano(String type, int numberOfKeys) {
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
