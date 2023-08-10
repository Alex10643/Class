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
        //FIXME secondAge is never used
        int secondAge = human.age;
        if (human.age > 20) {
            //FIXME we compare not with Vova every time (it's not "compareToVova" method) - every time human(name) can be different
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
