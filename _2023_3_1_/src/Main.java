public class Main {
    public static void main(String[] args) {
        System.out.println(Dummy.count());
        Dummy d1 = new Dummy ("First Dummy");
        System.out.println(d1.count());
        Dummy d2 = new Dummy ("Second Dummy");
        System.out.println(d1.count());
    }
}