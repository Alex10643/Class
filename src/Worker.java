public abstract class Worker {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name);
    }

    public void doSomeWork() {
        System.out.println(name);
    }
}
