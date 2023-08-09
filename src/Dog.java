public class Dog {
    String name;
    String breed;
    int speed;

    public Dog(String name, String breed, int speed) {
            this.name = name;
            this.breed = breed;
            this.speed = speed;
    }

    public void info() {
            System.out.println(name);
            System.out.println(breed);
            System.out.println(speed);
    }

    void runDog() {
            System.out.print("Run ");
            for (int i = 0; i < speed; i++) {
                System.out.print("run ");
            }
            System.out.println(" ");
    }

}
