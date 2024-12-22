package application;

public class StandardSensor implements Sensor{
    private int reading;

    public StandardSensor(int reading){
        this.reading = reading;
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public int read() {
        return this.reading;
    }

    @Override
    public void setOff() {
        
    }

    @Override
    public void setOn() {
        
    }


}
