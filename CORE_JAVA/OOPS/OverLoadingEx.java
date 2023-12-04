package CORE_JAVA.OOPS;

public class OverLoadingEx {
    public void m1() {
        System.out.println("m1() called :");
    }

    public void m1(int a) {
        System.out.println("int argument m1() called :" + a);

    }

    public void m1(int a, int b) {
        int c = a + b;
        System.out.println("int 2 args m1() called :" + c);

    }


    public static void main(String[] args) {
        OverLoadingEx ex = new OverLoadingEx();
        ex.m1();
        ex.m1(10);
        ex.m1(10, 20);


    }
}

//In overloading compiler is responsible to perform method resolution(decision) based on
//        the reference type. Hence overloading is also considered as compile time
//        polymorphism(or) static ()early biding.
