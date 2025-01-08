
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed? ");
        Integer desiredNumber = Integer.valueOf(scanner.nextLine());

        Random numbers = new Random();

        for (int i = 0; i < desiredNumber; i++) {
            int randomNumbers = numbers.nextInt(11);
            System.out.println(randomNumbers);
        }
    }

}
