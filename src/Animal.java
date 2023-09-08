public abstract class Animal {
    String name;
    String breed;

    public Animal(String name,String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String info() {
        String str = name + breed;
        return str;
    }

    void run(int distance) {
        System.out.println("dis = " + distance );
    }

    abstract void swim(int distance);


    abstract void voice();
}