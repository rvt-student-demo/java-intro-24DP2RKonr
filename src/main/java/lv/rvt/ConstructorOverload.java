package lv.rvt;

public class ConstructorOverload {
    private String name;
    private String location;
    private int weight;

    public ConstructorOverload(String name) {
        this(name, "shelf", 1);
    }

    public ConstructorOverload(String name, String location) {
        this(name, location, 1);
    }

    public ConstructorOverload(String name, int weight) {
        this(name, "shelf", weight);
    }

    private ConstructorOverload(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
