
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                break;
            }

            numbers.add(value);
        }
        System.out.println(positive(numbers));
        scanner.close();
    }

    public static List<Integer> positive(List<Integer> number){
        
        ArrayList<Integer> values = number.stream()
            .filter(value -> value > 0)
            .collect(Collectors.toCollection(ArrayList::new));
    
        return values;
    }

}
