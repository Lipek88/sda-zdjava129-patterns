package pl.sdacademy.java.patterns;

public class Janitor {
    private int numberOfKeys;
    private int age;
    private Employee employee;

    public Janitor(int numberOfKeys, int age) {
        this.numberOfKeys = numberOfKeys;
        this.age = age;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getAge() {
        return age;
    }

}
