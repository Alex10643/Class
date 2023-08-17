import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nm = scn.nextLine();
        String br = scn.nextLine();
        int sp = scn.nextInt();

        Dog d1 = new Dog(nm, br, sp);
        System.out.println(d1.info());



    }


}