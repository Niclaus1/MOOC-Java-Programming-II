import java.util.Scanner;

public class Cubes {
   public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);

      while(true) {
         String word = scanner.nextLine();
         if (word.equals("end")) {
            break;
         }
         int value = Integer.valueOf(word);

         int answer = value*value*value;
         System.out.println(answer);
      }
      scanner.close();
   }
}

