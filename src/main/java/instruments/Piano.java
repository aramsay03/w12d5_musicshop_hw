package instruments;

public class Piano {

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
}
