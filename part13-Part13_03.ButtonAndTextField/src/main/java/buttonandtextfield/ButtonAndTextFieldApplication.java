package buttonandtextfield;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
    
    public void start(Stage window){
        Button button = new Button("Button ");
        TextField textInput = new TextField();
        
        FlowPane combineOutput = new FlowPane();
        
        combineOutput.setOrientation(Orientation.VERTICAL);
        
        combineOutput.getChildren().add(button);
        combineOutput.getChildren().add(textInput);
        
        Scene windowOutput = new Scene(combineOutput);
        
        window.setScene(windowOutput);
        window.setTitle("Test Functionality");

        window.show();
        
        
    }

}
