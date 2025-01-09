package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
    
    public void start(Stage window){
        BorderPane layoutSides = new BorderPane();
        layoutSides.setTop(new Label("NORTH"));
        layoutSides.setRight(new Label ("EAST"));
        layoutSides.setBottom(new Label ("SOUTH"));
        
        Scene view = new Scene(layoutSides);
        
        window.setScene(view);
        window.setTitle("Sample");
        window.show();
        
    }
}
