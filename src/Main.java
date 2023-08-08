public class Main {

    public static void main(String[] args) {
       Human h1 = new Human("Vova",20, 30.2);
       Human h2 = new Human("Sasha",44, 189.9);
       Human h3 = new Human("Ruslan" ,1, 13);
       Human h4 = new Human("Vasya",60, 60.0);
        System.out.println(h1.name + " | " + h1.age + " | " + h1.weight);
        System.out.println(h2.name + " | " + h2.age + " | " + h2.weight);
        System.out.println(h3.name + " | " + h3.age + " | " + h3.weight);
        System.out.println(h4.name + " | " + h4.age + " | " + h4.weight);
        double arif = (double) (h1.age + h2.age + h3.age + h4.age) / 4;
        System.out.println(arif);
    }

}