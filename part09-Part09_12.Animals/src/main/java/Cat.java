public class Cat extends Animal implements NoiseCapable{

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void purr(){
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        purr();
    }
}