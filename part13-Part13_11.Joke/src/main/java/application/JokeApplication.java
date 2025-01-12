package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    public void start(Stage window) throws Exception{
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(20);
        
        Button button1 = new Button("Joke");
        Button button2 = new Button("Answer");
        Button button3 = new Button("Explanation");
        
        menu.getChildren().addAll(button1, button2, button3);
        
        layout.setTop(menu);
        
        StackPane firstView = createView("What do you call a bear with no teeth?");
        StackPane secondView = createView("A gummy bear.");
        StackPane thirdView = createView("I cant really explain this because, Im really good at jokes :( :(:(");
        
        button1.setOnAction((event) -> layout.setCenter(firstView));
        button2.setOnAction((event) -> layout.setCenter(secondView));
        button3.setOnAction((event) -> layout.setCenter(thirdView));
        
        layout.setCenter(firstView);
        
        Scene view = new Scene(layout);
        
        window.setTitle("Joke");
        window.setScene(view);
        window.show();
    }
    
    private StackPane createView (String text){
        StackPane layout =  new StackPane();
        layout.setPrefSize(300,180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
}
