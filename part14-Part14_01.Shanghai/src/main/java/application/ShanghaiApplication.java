package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {
    private Map<Integer,Integer> datas;
    
    public ShanghaiApplication(){
        this.datas = new HashMap<>();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    
    public void start(Stage window){
        NumberAxis xAxis = new NumberAxis(2005,2018,1);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        this.datas.put(2007,73);
        this.datas.put(2008,68);
        this.datas.put(2009,72);
        this.datas.put(2010,72);
        this.datas.put(2011,74);
        this.datas.put(2012,73);
        this.datas.put(2013,76);
        this.datas.put(2014,73);
        this.datas.put(2015,67);
        this.datas.put(2016,56);
        this.datas.put(2017,56);
        
        XYChart.Series<Number,Number> data = new XYChart.Series<>();
        data.setName("Shanghai Ranking");
        
        this.datas.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(party -> {
                    data.getData().add(new XYChart.Data<>(party.getKey(),party.getValue()));       
                    
                });
        
        lineChart.getData().add(data);

        
        Scene view = new Scene(lineChart,640,480);
        window.setTitle("Shanghai");
        window.setScene(view);
        window.show();      
    }
}

