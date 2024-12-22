package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean sensor;
    
    public TemperatureSensor(){
        this.sensor = false;
    }
    @Override
    public boolean isOn() {
        return this.sensor;
    }

    @Override
    public int read() {
        int min = -30;
        int max = 30;
        if (!isOn() ) {
            throw new IllegalStateException();
        }else{
            return new Random().nextInt((max - min) + 1) + min;
        }
    }

    @Override
    public void setOff() {
        this.sensor = false;       
    }

    @Override
    public void setOn() {       
        this.sensor = true; 
    }

}
