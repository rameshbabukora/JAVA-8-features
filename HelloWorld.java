import SRC.MyInterface;
import SRC.Student;

public class HelloWorld implements MyInterface {
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.m1();
        int a = h.m2("ramesh");

        System.out.println("hello");
        System.out.println(a);
        Student s1 = new Student(101, "ramesh");
        System.out.println(s1.getId() + "+" + s1.getName());
        Student b = h.m3(102, "rk");
        System.out.println(b.getId() + "--" + b.getName());

    }

    @Override
    public void m1() {
        System.out.println(x);
    }

    public int m2(String s) {

        return s.length();
    }

    public Student m3(int id, String name) {


        return new Student(id, name);
    }
}
