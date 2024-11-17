import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String products, int prices, int stock) {
        productPrice.put(products, prices);
        productStock.put(products, stock);

    }

    public int price(String product) {
        if (!productPrice.containsKey(product)) {
            return -99;
        }
        return productPrice.get(product);
    }

    public int stock(String product) {
        if (!productStock.containsKey(product)) {
            return 0;
        }
        return productStock.get(product);
    }

    public boolean take(String product) {
        if (productStock.containsKey(product)) {
            productStock.replace(product, productStock.get(product) - 1);
            if (productStock.get(product) < 0) {
                productStock.replace(product, 0);
                return false;
            }
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return productPrice.keySet();
    }
}