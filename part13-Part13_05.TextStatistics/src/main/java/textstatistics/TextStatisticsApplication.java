package textstatistics;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
                
        
        TextArea inputText = new TextArea();
        
        layout.setCenter(inputText);
        
        HBox textStats = new HBox();
        textStats.setSpacing(10);
        textStats.getChildren().add(new Label("Letters: 0"));
        textStats.getChildren().add(new Label(("Words: 0")));
        textStats.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(textStats);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.setTitle("Text Statistics");
        window.show();
        
    }
}
