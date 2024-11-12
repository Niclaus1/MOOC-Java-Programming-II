import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        int number = 0;

        for (String lists : list) {
            number++;
            System.out.println(number + ": " + lists);
        }
    }

    public void remove(int number) {
        list.remove(number - 1);
    }
}