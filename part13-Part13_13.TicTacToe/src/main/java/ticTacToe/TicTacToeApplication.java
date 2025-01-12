package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{
    private Button[][] bt = new Button[3][3];
    private boolean xStatus = false;
    private String winner = "";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage window) throws Exception{
        BorderPane layout = new BorderPane();
        
        
        Label turnPlayer = new Label("Turn: X");       
        layout.setTop(turnPlayer);
        
        
        GridPane gameLayout = new GridPane();
        gameLayout.setAlignment(Pos.CENTER);
        gameLayout.setHgap(5);
        gameLayout.setVgap(5);
        gameLayout.setPadding(new Insets(10,10,10,10));
        
        for(int row = 0; row <3; row++){
            for(int col = 0; col <3; col++){
                Button button = new Button();
                button.setPrefSize(100, 100);
                
                bt[row][col] = button;
                gameLayout.add(button,col,row);
                
                button.setOnMouseClicked((event) -> {
                    if(!button.getText().isEmpty()){
                        return;
                    }
                    
                    if(!this.xStatus){
                        button.setText("X");                        
                        turnPlayer.setText("Turn: O");
                        this.xStatus = true;
                    }else{
                        button.setText("O");      
                        turnPlayer.setText("Turn: X");
                        this.xStatus = false;
                    }

                    if(winnerCheck() == true){
                        turnPlayer.setText("The end!" );
                        for (int row1 = 0; row1 < 3; row1++) {
                            for (int col1 = 0; col1 < 3; col1++) {
                                bt[row1][col1].setDisable(true);
                             }
                        }
                    }
                });   
            }  
        }
        
        layout.setTop(turnPlayer);     
        layout.setCenter(gameLayout);
        
        Scene view = new Scene(layout);
        
        window.setTitle("TicTacToe");
        window.setScene(view);
        window.show();
    }
    
    private boolean winnerCheck(){
        if (!bt[0][0].getText().isEmpty() && bt[0][0].getText().equals(bt[1][1].getText()) && bt[1][1].getText().equals(bt[2][2].getText())) {
            this.winner = bt[0][0].getText();
            return true;
    } 
        else if (!bt[0][2].getText().isEmpty() && bt[0][2].getText().equals(bt[1][1].getText()) && bt[1][1].getText().equals(bt[2][0].getText())) {
            this.winner = bt[0][2].getText();
            return true;
    }

        for (int i = 0; i < 3; i++) {
            if (!bt[i][0].getText().isEmpty() && bt[i][0].getText().equals(bt[i][1].getText()) && bt[i][1].getText().equals(bt[i][2].getText())) {
                this.winner = bt[i][0].getText();
                return true;
        }
            if (!bt[0][i].getText().isEmpty() && bt[0][i].getText().equals(bt[1][i].getText()) && bt[1][i].getText().equals(bt[2][i].getText())) {
                this.winner = bt[0][i].getText();
                return true;
            }
        }
        return false;
    }
}
