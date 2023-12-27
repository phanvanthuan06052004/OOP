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
    private static String id; //____//nằm ở 1 vùng nhớ riêng, mà object nào cx xài ké, chung
    public static String name; //____//vùng nhớ xài chung cho các object cùng nhóm/Class
                                       //dữ liệu đổ vào hay chỉnh sửa ăn theo thằng cuối cùng
    //CHỐT HẠ: KO DÙNG STATIC CHO NHỮNG THỨ/DĐ/ HÀM MÀ CỦA RIÊNG TỪNG OBJECT
    //tui có mã số, bạn có ms, bạn kia có ms, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm, khác value, vậy phải có biến clone riêng - NON-STATIC
    
    
    public int yob;//____
    private double gpa; //grade point average       non-static
    //.....

    public Student(String id, String iname, int yob, double gpa) {
        this.id = id;
        name = iname;
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
        System.out.println("yob: " + yob);
    }//NON STATIC CHƠI VỚI NON- DĨ NHIÊN CÙNG OBJ, VÀ STATIC LUÔN, ĐỒ RIÊNG TÀNH CHUNG
    public int getAge(){
        return 2021 - yob;
    }
    
    public static void sayHi(){
        System.out.print("Hi everyone, my name is " + name);
        //System.out.print("by the way, my yob is " + yob);
        //static chỉ chơi vơi static vì cùng hku vực
            //có quá trời yob đc colone biết lấy ai bỏ ai
    }
    
}
