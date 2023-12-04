package CORE_JAVA.INTERFACES;

import java.util.HashMap;

public class Student {
    int id;
    String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;

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

    public static void main(String[] args) {
        System.out.println("Student main method");


    }



}
