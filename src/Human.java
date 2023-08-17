public class Human {
    String name;
    static int age;
    double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


   /* public static void compare(Human, Human) {
        //FIXME secondAge is never used
        if (Human.age > Human.age) {
            //FIXME we compare not with Vova every time (it's not "compareToVova" method) - every time human(name) can be different
            System.out.println("Older than Vova");
        }
        else if (Human.age < Human.age) {
            System.out.println("Younger than Vova");
        }
        else {
            System.out.println("Equal years");
        }
    }*/

}
