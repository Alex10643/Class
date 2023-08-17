public abstract class Animal {
    String name;
    String breed;
    int speed;

    public Animal(String name,String breed, int speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    public String info() {
        String str = name + breed + speed;
        return str;
    }

    void run1() {
        System.out.println("run = " + speed);
    }
    void run() {
        for (int i = 0; i < speed; i++) {
            System.out.print("run ");
        }
        System.out.println(" ");
    }
    void voice() {
        System.out.println("Meow");
    }
}