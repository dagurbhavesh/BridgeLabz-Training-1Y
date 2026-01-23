class HelloWorld {
    static int emailId;
}

public class Demol {
    static int x = 50;
    int z = 60;

    public static void m2() {
        int y = 30;
        System.out.println("m2 local var " + y);
    }

    public static void m1() {
        int y = 20;
        System.out.println("m1 local var " + y);
        m2();
    }

    public static void main(String[] args) {
        int y = 10;
        System.out.println("HelloWorld");
        System.out.println("main static var x " + x);
        System.out.println("main local var y " + y);
        m1();

        Demol obj = new Demol();
        System.out.println("instance/non-static/object-level var " + obj.z);
    }
}
