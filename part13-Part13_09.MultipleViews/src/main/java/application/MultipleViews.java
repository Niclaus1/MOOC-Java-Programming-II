package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main (String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    public void start(Stage window){
        BorderPane layout1 = new BorderPane();
        VBox layout2 = new VBox();
        GridPane layout3 = new GridPane();

        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);
        Scene scene3 = new Scene(layout3);

        Label text1 = new Label("First view!");
        Button botton1 = new Button("To the second view!");
        layout1.setTop(text1);
        layout1.setCenter(botton1);
        
        botton1.setOnAction((event) -> {
            window.setScene(scene2);
        });
        
        
        Button button2 = new Button("To the third view");
        Label label2 = new Label("Second view!");
        layout2.getChildren().addAll(button2, label2);
        
        button2.setOnAction((event) -> {
            window.setScene(scene3);
        });
                
        
        Label label3 = new Label("Third view!");
        Button button3 = new Button("To the first view!");
        
        layout3.add(label3, 0, 0);
        layout3.add(button3, 1, 1);
        
        button3.setOnAction((event) -> {
            window.setScene(scene1);
        });
        
        window.setTitle("Multiple views");
        window.setScene(scene1);
        window.show();
    }

}
