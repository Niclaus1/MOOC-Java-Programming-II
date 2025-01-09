package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    public void start(Stage window){
        
        TextField text = new TextField();
        Label newText = new Label();
        Button buttonText = new Button("Update");
        
        buttonText.setOnAction((event) -> {
            newText.setText(text.getText());});
        
        VBox layout = new VBox();
        layout.getChildren().addAll(text,buttonText,newText);
        
        Scene view = new Scene(layout);
        
        window.setTitle("Notifier");
        window.setScene(view);
        window.show();
 
    }
}
