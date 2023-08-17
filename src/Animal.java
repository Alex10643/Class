public abstract class Animal {
    String name;
    String breed;
    int speed;

    public Animal(String name,String breed, int speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    public void info() {
        System.out.println(name);
        System.out.println(breed);
        System.out.println(speed);
    }

    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.print("run ");
        }
        System.out.println(" ");
    }
}