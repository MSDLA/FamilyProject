package family;

public class Daughter {
    private String name;
    private int age;

    public Daughter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printDaughter() {
        System.out.println("Dotters namn är " + name + " och hon är " + age + " år gammal.");
    }
}