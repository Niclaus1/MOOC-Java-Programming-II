package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(args);
    }
    
    public void start(Stage window) throws Exception{
        
        Label insertName = new Label("Enter your name and start.");
        TextField inputText = new TextField();
        Button start = new Button("Start");
        
        GridPane layout = new GridPane();
        layout.add(insertName,0,0);
        layout.add(inputText,0,1);
        layout.add(start,0,2);
        
        layout.setPrefSize(300,180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20,20,20,20));
        
        Scene firstView = new Scene(layout);
        
        Label welcomeText = new Label("Welcome");
        
        StackPane layout2 = new StackPane();
        
        layout2.setPrefSize(300,180);
        layout2.getChildren().add(welcomeText);
        layout2.setAlignment(Pos.CENTER);
        
        Scene secondView = new Scene(layout2);
        
        start.setOnAction((event) -> {
            welcomeText.setText(welcomeText.getText() + " " + inputText.getText() + "!");
            window.setScene(secondView);
    });
        window.setTitle("Greeter");
        window.setScene(firstView);
        window.show();
    }
}
