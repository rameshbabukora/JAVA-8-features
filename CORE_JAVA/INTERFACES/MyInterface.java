package CORE_JAVA.INTERFACES;

import CORE_JAVA.JAVA_8_FEATURES.Employee;

public interface MyInterface {
    void m1();//by default, it will be like :public abstract void m1()
    public int m2(String s);
    public Student m3(int id,String name);
    public Employee m4(int id, String name, String email, String address, double salary);

    int x = 20;//by default, it will be like :public static final int x=20;


}
