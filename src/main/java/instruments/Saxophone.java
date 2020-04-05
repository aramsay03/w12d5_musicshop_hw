package instruments;

public class Saxophone implements IPlay {

    private String type;
    private String material;

    public Saxophone(String type, String material) {
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
