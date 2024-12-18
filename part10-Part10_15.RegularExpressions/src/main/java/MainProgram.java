import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Checker checking = new Checker();

        System.out.print("Enter a string: ");
        String input = scan.nextLine();


        if (checking.isDayOfWeek(input) == true || checking.allVowels(input) == true || checking.timeOfDay(input) == true) {
            System.out.println("The Form is correct");
        }else {        
            System.out.println("The form is incorrect.");
        }
        scan.close();  
    }
}
