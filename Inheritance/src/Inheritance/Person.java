package Inheritance;

public class Person {
    protected String name;
    protected int age;

    /** Constructor. */
    public Person() {};

    /** Constructor. */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /** setter. */
    public void setAge(int age) {
        this.age = age;
    }

    /** getter. */
    public int getAge() {
        return this.age;
    }

    /** setter. */
    public void setName(String name) {
        this.name = name;
    }

    /** getter. */
    public String getName() {
        return this.name;
    }
}
