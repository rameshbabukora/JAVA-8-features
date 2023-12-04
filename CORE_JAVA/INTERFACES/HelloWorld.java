package CORE_JAVA.INTERFACES;

import CORE_JAVA.JAVA_8_FEATURES.Employee;

import java.util.stream.Stream;

public class HelloWorld implements MyInterface {
    public static void main(String[] args) {
        System.out.println("hello");

        HelloWorld h = new HelloWorld();
        h.m1();
        int a = h.m2("ramesh");
        System.out.println(a);

        Student s1 = new Student(101, "ramesh");
        System.out.println(s1.getId() + "+" + s1.getName());

        Student b = h.m3(102, "rk");
        System.out.println(b.getId() + "--" + b.getName());

        Employee e1 = new Employee(101, "ram", "ram@gmail.com", "agp", 50000.0);
        Employee e2 = new Employee(102, "raja", "raja@gmail.com", "pkl", 52000.0);
        Employee e3 = new Employee(103, "ravi", "ravi@gmail.com", "hyd", 55000.0);
        Employee e4 = new Employee(104, "roja", "roja@gmail.com", "hyd", 20000.0);
        Employee e5 = new Employee(105, "remo", "remo@gmail.com", "gnt", 30000.0);
        Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
        stream.filter(e -> e.getSalary() >= 50000).map(e -> e.getName() + ":" + e.getSalary()).forEach(System.out::println);

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

    public Employee m4(int id, String name, String email, String address, double salary) {

        return new Employee(id, name, email, address, salary);
    }
}
