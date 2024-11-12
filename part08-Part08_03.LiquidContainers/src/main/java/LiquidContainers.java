
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstValue = 0;
        int secondValue = 0;

        while (true) {
            System.out.println("First: " + firstValue + "/100" + "\n"
                    + "Second: " + secondValue + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                firstValue += amount;
                if (firstValue > 100) {
                    firstValue = 100;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (firstValue < amount) {
                    amount = firstValue;
                }

                firstValue -= amount;
                secondValue += amount;

                if (secondValue > 100) {
                    secondValue = 100;

                }
            }

            if (command.equals("remove") && amount > 0) {
                secondValue -= amount;
                if (secondValue < 0) {
                    secondValue = 0;
                }
            }
        }
        scan.close();
    }
}
