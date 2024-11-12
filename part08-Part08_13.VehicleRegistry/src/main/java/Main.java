

public class Main {

    public static void main(String[] args) {
        VehicleRegistry registry = new VehicleRegistry();

        LicensePlate plate1 = new LicensePlate("FI", "ABC-123");
        LicensePlate plate2 = new LicensePlate("FI", "XYZ-987");
        LicensePlate plate3 = new LicensePlate("FI", "ABC-123"); // Same as plate1

        // Test add method
        System.out.println(registry.add(plate1, "John Doe")); // Expected: true (new entry)
        System.out.println(registry.add(plate2, "Jane Smith")); // Expected: true (new entry)
        System.out.println(registry.add(plate1, "Alice Brown")); // Expected: false (plate1 already added)

        // Test get method
        System.out.println(registry.get(plate1)); // Expected: John Doe
        System.out.println(registry.get(plate3)); // Expected: John Doe (plate3 is same as plate1)
        System.out.println(registry.get(new LicensePlate("FI", "NO-PLATE"))); // Expected: null (not added)

        // Test remove method
        System.out.println(registry.remove(plate2)); // Expected: true (exists and removed)
        System.out.println(registry.remove(plate2)); // Expected: false (already removed)

        // Test printLicensePlates and printOwners methods
        System.out.println("License Plates:");
        registry.printLicensePlates(); // Expected to print: FI ABC-123

        System.out.println("Owners:");
        registry.printOwners();

    }
}
