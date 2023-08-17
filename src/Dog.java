public class Dog {
    String name;
    String breed;
    int speed;

    public Dog(String name, String breed, int speed) {
            this.name = name;
            this.breed = breed;
            this.speed = speed;
    }

    public String info() {
        String str = name + breed + speed;
            return str;
    }
//FIXME method runDog should return "run" == speed. You have speed += 1
    void runDog() {
            for (int i = 0; i < speed; i++) {
                System.out.print("run ");
            }
            System.out.println(" ");
    }

}
