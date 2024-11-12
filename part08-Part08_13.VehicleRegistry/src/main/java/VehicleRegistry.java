import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicle;

    public VehicleRegistry() {
        this.vehicle = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!vehicle.containsKey(licensePlate)) {
            vehicle.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate plates : vehicle.keySet()) {
            if (plates.equals(licensePlate)) {
                return vehicle.get(licensePlate);
            }
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicle.containsKey(licensePlate)) {
            vehicle.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : vehicle.keySet()) {
            System.out.println(plates);

        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String string : vehicle.values()) {
            if (!owners.contains(string)) {
                owners.add(string);
            }
        }
        for (String strings : owners) {
            System.out.println(strings);
        }
    }
}