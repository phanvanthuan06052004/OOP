package data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
public class Student {
    
    private  String id; //instance variable
    private String name; //_
    private int yob;//____
    private double gpa; //grade point average       non-static
    //.....

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

//    public String getId() {
//        return id;
//    } //hiếm hki đổi mã số, giống như môn DB primary key 

    public void setId(String id) {
        this.id = id;
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
        return String.format("|%8s|%-25s|%4d|%4.1f|", 
                                    id, name, yob, gpa);
    }
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", 
                                    id, name, yob, gpa);
    //    System.out.println("yob: " + yob);
    }//NON STATIC CHƠI VỚI NON- DĨ NHIÊN CÙNG OBJ, VÀ STATIC LUÔN, ĐỒ RIÊNG TÀNH CHUNG
    public int getAge(){
        return 2021 - yob;
    }
  
    
}
