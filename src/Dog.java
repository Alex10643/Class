public class Dog extends Animal {
    public Dog(String name, String breed, int speed) {
        super(name, breed, speed);
    }

    @Override
    void voice() {
        System.out.println("Bark!");
    }

}
