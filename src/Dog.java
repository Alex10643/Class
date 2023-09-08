public class Dog extends Animal {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " can't run that distance");
        } else {
            System.out.printf("%s ran %d \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " can't swim");
        } else {
            System.out.println(name + " " + distance + " ");
        }
    }

    @Override
    void voice() {
        System.out.println("Bark!");
    }

}
