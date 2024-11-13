import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (storage.get(storageUnit).contains(item)) {
            storage.get(storageUnit).remove(item);
        }

        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();

        for (String string : storage.keySet()) {
            keys.add(string);
        }
        return keys;
    }
}