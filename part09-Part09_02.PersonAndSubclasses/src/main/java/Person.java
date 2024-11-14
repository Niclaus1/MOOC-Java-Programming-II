public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name + "\n" + "  " + this.address;
    }

}