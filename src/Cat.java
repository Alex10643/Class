public class Cat extends Animal {
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " can't run that distance");
        } else {
            System.out.printf("%s ran %d \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " can't swim");
    }

    @Override
    void voice() {
        System.out.println("Meow!");
    }


}
