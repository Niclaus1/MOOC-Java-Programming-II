
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        int max = 40, min = 1;

        Random number = new Random();

        while (this.numbers.size() < 7) {
            int randomNumbers = number.nextInt(max - min + 1) + min;
            if (!containsNumber(randomNumbers)) {
                this.numbers.add(randomNumbers);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}
