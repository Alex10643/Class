import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Vasya", 32, 82.3);
        Human h2 = new Human("Carl", 10, 70.1);
        /*Scanner scn = new Scanner(System.in);
        String nm = scn.nextLine();
        String br = scn.nextLine();
        int sp = scn.nextInt();

        Dog d1 = new Dog(nm, br, sp);
        System.out.println(d1.info());*/

        Human.compare(h1, h2);


    }


}