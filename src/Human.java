public class Human {
    String name;
    static int age;
    double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //The age of h1 and h2 is always equal to h2
    public static void compare(Human h1, Human h2) {
        System.out.println(h1.age + " " + h2.age);
        if (h1.age < h2.age ) {
            System.out.println(h1.name + "younger than" + h2.name);
        }
        if (h1.age > h2.age) {
            System.out.println(h1.name + " older than " + h2.name);
        }
    }

}
