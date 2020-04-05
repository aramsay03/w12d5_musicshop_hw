package instruments;

public class Guitar {

    private String type;
    private int numberOfStrings;
    private String material;

    public Guitar(String type, int numberOfStrings, String material) {
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
}