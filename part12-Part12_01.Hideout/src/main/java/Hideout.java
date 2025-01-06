public class Hideout<T> {
    private T toHide;

    public void putIntoHideout(T toHide){
        this.toHide = toHide;
    }

    public T takeFromHideout(){
        T takeHide = toHide;
        toHide = null;
        return takeHide;
    }

    public boolean isInHideout(){
        return this.toHide != null;
    }
}
