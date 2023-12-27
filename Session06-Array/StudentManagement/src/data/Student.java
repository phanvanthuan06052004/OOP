/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Student {
    private String ID;
    public String name; //static toang
    private int yob;
    private double gpa;

    public Student(String ID, String name, int yob, double gpa) {
        this.ID = ID;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
    }
    
    public void showProfile() {
        System.out.printf("|%-8s|%-25s|%4d|%4.1f|\n",
                            ID, name, yob, gpa);
    }
}
