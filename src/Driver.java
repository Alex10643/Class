public class Driver extends Worker implements Inter {
    public Driver (String name) {
        super (name);
    }

    @Override
    public void doSomeWork() {
        System.out.println("The driver delivers the goods");
    }
}
