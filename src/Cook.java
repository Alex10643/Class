public class Cook extends Worker implements InterCk {
    public Cook (String name) {
        super (name);
    }

    @Override
    public void doSomeWork() {
        System.out.println("The cook makes food");
    }
}
