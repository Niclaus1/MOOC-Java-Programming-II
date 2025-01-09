package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
    
    @Override
    public void start(Stage window){
        Button button = new Button("Chin Chin");
        Label labels =  new Label("I Love Youu!!!!");
        
        FlowPane groupTheComponents = new FlowPane();
        groupTheComponents.getChildren().add(button);
        groupTheComponents.getChildren().add(labels);
        
        Scene output = new Scene(groupTheComponents);
        
        window.setScene(output);
        window.show();
        
    }
}
