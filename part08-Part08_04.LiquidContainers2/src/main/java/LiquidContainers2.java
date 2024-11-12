
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1 + "\n"
                    + "Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                container1.add(amount);
            }

            if (command.equals("move") && amount > 0) {
                if (container1.contains() < amount) {
                    amount = container1.contains();
                }
                container1.remove(amount);
                container2.add(amount);
            }

            if (command.equals("remove") && amount > 0) {
                container2.remove(amount);
            }
            System.out.println("");
        }
        scan.close();
    }
}
