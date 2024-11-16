public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory balanceHistory;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.balanceHistory = new ChangeHistory();
        balanceHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return balanceHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        balanceHistory.add(getBalance());

    }

    @Override
    public double takeFromWarehouse(double amount) {
        balanceHistory.add(getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {

        System.out.println("Product: " + super.getName() + "\n"
                + "History: " + balanceHistory + "\n"
                + "Largest amount of product: " + balanceHistory.maxValue() + "\n"
                + "Smallest amount of product: " + balanceHistory.minValue() + "\n"
                + "Average: " + balanceHistory.average());
    }

}