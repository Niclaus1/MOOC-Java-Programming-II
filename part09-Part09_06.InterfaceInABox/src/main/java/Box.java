import java.util.ArrayList;

public class Box implements Packable {
    private double maximunCapacity;
    private ArrayList<Packable> load;

    public Box(double maximunCapacity) {
        this.maximunCapacity = maximunCapacity;
        this.load = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maximunCapacity) {
            this.load.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : load) {
            weight += packable.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + load.size() + " items, total weight " + weight() + " kg";
    }
}