import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (shoppingCart.containsKey(product)) {
            shoppingCart.get(product).increaseQuantity();

        } else {
            Item item = new Item(product, 1, price);
            shoppingCart.put(product, item);
        }
    }

    public int price() {
        int number = 0;
        for (Item item : shoppingCart.values()) {
            number += item.price();
        }
        return number;
    }

    public void print() {
        for (Item name : shoppingCart.values()) {
            System.out.println(name.toString());
        }
    }
}