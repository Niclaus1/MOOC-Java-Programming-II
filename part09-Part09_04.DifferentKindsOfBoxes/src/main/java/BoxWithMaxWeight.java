import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item weights : items) {
            currentWeight += weights.getWeight();
        }

        if (currentWeight + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemHash : items) {
            if (itemHash.hashCode() == item.hashCode()) {
                return true;
            }
        }
        return false;
    }

}