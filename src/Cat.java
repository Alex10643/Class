public class Cat extends Animal {
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    void run() {
        if (speed > 200) {
            System.out.println(name + " can't run that distance");
        } else {
            System.out.printf("%s ran %d \n", name, speed);
        }
    }

    @Override
    void swim() {
        System.out.println(name + " can't swim");
    }

    @Override
    void voice() {
        System.out.println("Meow!");
    }


}
