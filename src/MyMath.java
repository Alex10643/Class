public class MyMath {
    public static int sum(int... numbers) {
        int summmation = 0;
        for (int i : numbers) {
            summmation += i;
        }
        return summmation;
    }

    public static int mul(int... numbers) {
        int multiplication = 1;
        for (int i : numbers) {
            multiplication *= i;
        }
        return multiplication;
    }

    public static double div(double... numbers) {
        double division = 1;
        for (double i : numbers) {
            division /= i;
        }
        return division;
    }

}
