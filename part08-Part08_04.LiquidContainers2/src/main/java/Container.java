public class Container {
    private int values;

    public Container() {
        this.values = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.values += amount;

        if (this.values > 100) {
            this.values = 100;
        }
    }

    public int contains() {
        return this.values;
    }

    public void remove(int amount) {
        this.values -= amount;

        if (this.values < 0) {
            this.values = 0;
        }
    }

    public String toString() {
        return this.values + "/100";
    }
}