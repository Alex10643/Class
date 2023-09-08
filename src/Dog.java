public class Dog extends Animal {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    void run() {
        if (speed > 500) {
            System.out.println(name + " can't run that distance");
        } else {
            System.out.printf("%s ran %d \n", name, speed);
        }
    }

    @Override
    void swim() {
        if (speed > 10) {
            System.out.println(name + " can't swim");
        } else {
            System.out.println(name + " " + speed + " ");
        }
    }

    @Override
    void voice() {
        System.out.println("Bark!");
    }

}
