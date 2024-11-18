public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    public void eats() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
        bark();
    }
}