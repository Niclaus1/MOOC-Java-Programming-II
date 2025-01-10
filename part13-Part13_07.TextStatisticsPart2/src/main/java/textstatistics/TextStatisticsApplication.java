package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        TextArea textInput = new TextArea();  
        
        Label letters = new Label("Letters: ");
        Label words = new Label ("Words: ");
        Label longestWord = new Label ("The longest word is: ");
        
        textInput.textProperty().addListener((change,oldValue,newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split("\\s+");
            int word = parts.length;
            
            String longest = Arrays.stream(parts)
                        .sorted((x,y) -> y.length() - x.length())
                        .findFirst()
                        .get();
            
            letters.setText("Letters: " + characters);
            words.setText("Words: " + word);
            longestWord.setText("The longest word is: " + longest);
            
        });
        
        HBox statsLayout = new HBox();
        statsLayout.setSpacing(10);
        statsLayout.getChildren().addAll(letters,words,longestWord);
        
        layout.setCenter(textInput);
        layout.setBottom(statsLayout);
        
        Scene view = new Scene(layout);
        
        window.setTitle("Text Statistics, part II");
        window.setScene(view);
        window.show();
    }

}
