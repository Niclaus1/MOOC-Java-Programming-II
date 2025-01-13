package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{
    private HashMap<String,Map<Integer,Double>> data = new HashMap<>();

    public PartiesApplication(){
        data = dataGathering("partiesdata.tsv");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }
    public void start(Stage window){
        NumberAxis xAxis = new NumberAxis(1965,2010,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);

        LineChart<Number,Number> chart = new LineChart<>(xAxis,yAxis);
        chart.setTitle("Relative support of the parties");
        
        this.data.keySet().stream().forEach(party -> {
            XYChart.Series<Number,Number> data = new XYChart.Series<>();
            data.setName(party);
            
            this.data.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data<>(pair.getKey(), pair.getValue()));
            });
            System.out.println(data);
            chart.getData().add(data);
        });    
        
        Scene view = new Scene(chart,640,480);
        window.setTitle("Finnish parties");
        window.setScene(view);
        window.show();
    }
    
    private HashMap<String,Map<Integer,Double>> dataGathering(String textFile){
        ArrayList<Integer> years = new ArrayList<>();
        HashMap<String,Map<Integer,Double>> map = new HashMap<>();
        
        try(Scanner scan = new Scanner(Paths.get(textFile))){        
            String variable = scan.nextLine();
            String[] row1 = variable.split("\\s+"); 
            
            for(int i = 1; i<row1.length; i++){
                    years.add(Integer.valueOf(row1[i]));
                    } 
                
            while(scan.hasNextLine()){
               String restRow = scan.nextLine();
               String[] parts = restRow.split("\\s+");
               
               String party = parts[0];
               HashMap<Integer,Double> supportData = new HashMap<>();
               
               for(int i = 1; i < parts.length; i++){
                if(!parts[i].equals("-")){
                    int year = years.get(i - 1);
                    double yearData = Double.valueOf(parts[i]);
                    supportData.put(year, yearData);
                }
            }
            map.put(party,supportData);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        return map;
    }
    
}
