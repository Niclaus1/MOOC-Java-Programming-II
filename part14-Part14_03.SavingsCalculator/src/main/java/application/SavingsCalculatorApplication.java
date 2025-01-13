package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage window){
        BorderPane mainlayout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number,Number> chart = new LineChart<>(xAxis,yAxis);
        chart.setTitle("Monthly Savings: ");
        
        mainlayout.setCenter(chart);

        VBox sliders = new VBox();
        sliders.setSpacing(10);
        sliders.setPadding(new Insets(10,10,10,10));
 
        BorderPane firstPane = new BorderPane();
        firstPane.setPadding(new Insets(10,10,10,10));
        Label savings = new Label("Monthly savings" );
        firstPane.setLeft(savings);
        
        Slider slider1 = new Slider();
            slider1.setMin(25);
            slider1.setMax(250);
            slider1.setBlockIncrement(25);
            slider1.setPrefWidth(300);
            slider1.setShowTickMarks(true);
            slider1.setShowTickLabels(true);
        
        firstPane.setCenter(slider1);
        Label savingsValue = new Label();
        firstPane.setRight(savingsValue);
            
        BorderPane secondPane = new BorderPane();
        secondPane.setPadding(new Insets(10,10,10,10));
        Label interest = new Label ("Yearly interest rate");
        secondPane.setLeft(interest);
        
            
        Slider slider2 = new Slider();
            slider2.setMin(0);
            slider2.setMax(10);
            slider1.setPrefWidth(300);
            slider2.setShowTickLabels(true);
            slider2.setShowTickMarks(true);
        secondPane.setCenter(slider2);
        Label interestValue = new Label();
        secondPane.setRight(interestValue);
        

        XYChart.Series savingsChart = new XYChart.Series();
        savingsChart.setName("Savings");
        XYChart.Series interestChart = new XYChart.Series();
        interestChart.setName("Interest");
        
        slider1.valueProperty().addListener((observable,oldValue,newValue) -> {
            savingsValue.setText(String.valueOf(newValue));
            updater(slider1.getValue(), slider2.getValue(), savingsChart, interestChart);
        });      
        
        slider2.valueProperty().addListener((observable,oldValue,newValue) -> {
            interestValue.setText(String.valueOf(newValue));
            updater(slider1.getValue(), slider2.getValue(), savingsChart, interestChart);
        });
               
        chart.getData().add(savingsChart);
        chart.getData().add(interestChart);
        
        sliders.getChildren().add(firstPane);
        sliders.getChildren().add(secondPane);
        
        mainlayout.setTop(sliders);
                
        Scene view = new Scene(mainlayout,640,400);
        window.setTitle("Savings Calculator");
        window.setScene(view);
        window.show();
        
    }
    
    private void updater(double saving, double interests, XYChart.Series savings, XYChart.Series interest){
        savings.getData().clear();
        interest.getData().clear();
        
        savings.getData().add(new XYChart.Data<>(0,0));
        interest.getData().add(new XYChart.Data<>(0,0));
        
        double number = 0;
        
        for(int i = 1; i <31 ; i++){
            savings.getData().add(new XYChart.Data<>(i, i * saving * 12));
            number += saving * 12;
            number *= (1 + interests/100.0);
            interest.getData().add(new XYChart.Data<>(i,number));
        }
    }

}
