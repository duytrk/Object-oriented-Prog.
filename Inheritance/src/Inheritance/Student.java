package Inheritance;

public class Student extends Person {
    private String id;

    /** constructor */
    public Student(int age, String name, String id) {
        super(age, name);
        this.age = age;
    }

    /** setId */
    public void setId(String id) {
        this.id = id;
    }

    /** getId */
    public String getId() {
        return this.id;
    }
}
