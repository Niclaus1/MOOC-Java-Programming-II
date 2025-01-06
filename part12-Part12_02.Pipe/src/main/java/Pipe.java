import java.util.ArrayList;

public class Pipe <T> {
    private ArrayList<T> pipes;

    public Pipe(){
        this.pipes = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.pipes.add(value);
    }

    public T takeFromPipe(){
        if (isInPipe() != true) {
            return null;
        }
        T x = this.pipes.get(0);
        this.pipes.remove(0);
        return x;
    }

    public boolean isInPipe(){
        if (this.pipes.isEmpty()) {
            return false;
        }else{
            return true;
        }
    }
}
