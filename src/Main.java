import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Programmer chuvak = new Programmer("Vladimir");
        Driver dude = new Driver("Ryan Gosling");
        Cook chruchevoMaker = new Cook("Francesco");

        for (int i = 0; i < 3; i++) {
            chuvak.info();
            dude.info();
            chruchevoMaker.info();

            chuvak.doSomeWork();
            dude.doSomeWork();
            chruchevoMaker.doSomeWork();
            System.out.println(" ");

        }
    }


}