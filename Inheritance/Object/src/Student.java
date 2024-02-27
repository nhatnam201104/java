// package Inheritance.classobjectinjava;
public class Student {
    // instance variable / nonstatic variable
    private String name;   
    private String address;
    private double gpa;
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString ()
    {
        return "Name: "+name + "Address: "+address + "Gpa: "+gpa;
    }
}
