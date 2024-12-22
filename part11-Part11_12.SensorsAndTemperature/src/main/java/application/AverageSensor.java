package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        int totalOn = 0;
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == true) {
                totalOn++;
            }
        }
        return totalOn == sensors.size();
    }

    @Override
    public int read() {
        if (isOn() == false) {
            throw new IllegalStateException();
        }
        double average  = sensors.stream().mapToInt(i -> i.read()).average().getAsDouble();
        readings.add((int) average);
        return (int) average;
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public void setOn() {
      for (Sensor sensor : sensors) {
        sensor.setOn(); 
      }
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
