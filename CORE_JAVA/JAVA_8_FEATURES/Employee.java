package CORE_JAVA.JAVA_8_FEATURES;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String address;
    private double salary;

    public Employee(int id, String name, String email, String address, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "ram", "ram@gmail.com", "agp", 50000.0);
        Employee e2 = new Employee(102, "raja", "raja@gmail.com", "pkl", 52000.0);
        Employee e3 = new Employee(103, "ravi", "ravi@gmail.com", "hyd", 55000.0);
        Employee e4 = new Employee(104, "roja", "roja@gmail.com", "hyd", 20000.0);
        Employee e5 = new Employee(105, "remo", "remo@gmail.com", "gnt", 30000.0);

        Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
        stream.filter(e -> e.salary >= 50000).map(e -> e.name + ":" + e.salary).forEach(System.out::println);


    }

}
