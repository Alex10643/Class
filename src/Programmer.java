public class Programmer extends Worker implements InterProg {
    public Programmer(String name) {
        super (name);
    }

    @Override
    public void doSomeWork() {
        System.out.println("The programmer writes the code");
    }
}
