package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
         System.out.println("Hello world!");

        Scanner reader = new Scanner(System.in);
        System.out.println("What title would you like?");
        String title = reader.nextLine();

        Application.launch(UserTitle.class, "--title=" + title);

    }
}
