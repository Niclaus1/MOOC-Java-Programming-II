package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        if (name == null || name.isEmpty() || name.length() > 40 ) {
            throw new IllegalArgumentException();
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
