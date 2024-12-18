import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {

        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> iterate = employees.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterate = employees.iterator();

        while (iterate.hasNext()) {
            Person person = iterate.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterate = employees.iterator();

        while (iterate.hasNext()) {
            Person person = iterate.next();
            if (person.getEducation().equals(education)) {
                iterate.remove();
            }
        }
    }
}