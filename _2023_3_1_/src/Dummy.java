public class Dummy {
    // number of Dummy objects
    static int counter = 0;
    static int count() {
        return counter;
    }
    private String name;
    public Dummy(String name) {
        counter++;
        this.name = name;
    }
    //main function to test Dummy class
}
