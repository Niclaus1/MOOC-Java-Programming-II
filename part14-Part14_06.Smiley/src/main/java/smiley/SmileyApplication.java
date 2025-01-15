package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage window){
        Canvas paintArea = new Canvas(750,500);
        GraphicsContext painter = paintArea.getGraphicsContext2D();
        
        painter.setFill(Color.WHITE);
        painter.fillRect(0,0,750,500);
        
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(5);
        
        painter.strokeOval(200,100,350,350);
        
        painter.strokeOval(275,200,50,50);
        painter.strokeOval(435,200,50,50);
        
        painter.strokeArc(275,300,200,100,180,180,ArcType.ROUND);
        
        BorderPane paintLayout = new BorderPane();
        paintLayout.setCenter(paintArea);
        
        
        Scene view = new Scene(paintLayout);
        
        window.setTitle("Smiley");
        window.setScene(view);
        window.show();
        
        
    }

}
