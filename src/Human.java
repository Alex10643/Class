public class Human {
    String name;
    int age;
    double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    void compare(Human human) {
        int secondAge = human.age;
        if (human.age > 20) {
            System.out.println("Older than Vova");
        }
        else if (human.age < 20) {
            System.out.println("Younger than Vova");
        }
        else {
            System.out.println("Equal years");
        }
    }

}
