import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> productHistory;

    public ChangeHistory() {
        this.productHistory = new ArrayList<>();
    }

    public void add(double status) {
        productHistory.add(status);
    }

    public void clear() {
        productHistory.clear();
    }

    public double maxValue() {
        if (productHistory.isEmpty()) {
            return 0;
        }
        double currentValue = 0;

        for (Double value : productHistory) {
            if (value > currentValue) {
                currentValue = value;
            }
        }
        return currentValue;
    }

    public double minValue() {
        if (productHistory.isEmpty()) {
            return 0;

        }
        double currentValue = maxValue();

        for (Double value : productHistory) {
            if (value < currentValue) {
                currentValue = value;
            }
        }
        return currentValue;
    }

    public double average() {
        double total = 0;
        double sum = 0;

        if (productHistory.isEmpty()) {
            return 0;

        }
        for (Double value : productHistory) {
            total++;
            sum += value;
        }
        double average = sum / total;

        return average;
    }

    @Override
    public String toString() {
        return productHistory + "";
    }

}