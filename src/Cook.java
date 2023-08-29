public class Cook extends Worker implements Inter {
    public Cook (String name) {
        super (name);
    }

    @Override
    public void doSomeWork() {
        System.out.println("The cook makes food");
    }
}
