package instruments;

public class Saxaphone {

    private String type;
    private String material;

    public Saxaphone(String type, String material) {
        this.type = type;
        this.material = material;
    }


    public String getType() {
        return this.type;
    }

    public String getMaterial() {
        return this.material;
    }
}
