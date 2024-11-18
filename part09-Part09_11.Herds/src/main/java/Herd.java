import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable movable : herds) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String results = "";
        for (Movable movable : herds) {
            results += movable + "\n";
        }
        return results;
    }
}