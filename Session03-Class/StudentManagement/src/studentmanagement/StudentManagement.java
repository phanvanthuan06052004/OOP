/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Student;    //mượn đồ để dùng, tìm nơi cất
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputAstudent();
        saveAstudent();
    }
    
    //nhập từ bàn phím
    //cần Scanner object bàn phím, OOP cái gì cx object, class
    //Máy Cam, Scanner tiệm photo, WC, bàn ohims cơ, Touchpad -> nhóm Quét-Dữ-Liệu đưa
    //vào máy tính, class Dcanner cuất hiện. Xài phải new đẻ cho nó hành xử
    //từ bàn phím đi vào ram, do đó phải có biến hứng vlaue
    public static void inputAstudent(){
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");   //chuỗi trước sools ko bị lạc trôi kệnh
        name = sc.nextLine();
        
        System.out.print("Input yob: ");
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextFloat();
        
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        //x.setId(id );//nguy hiểm
    }
    
    //hard-code
    public static void saveAstudent() {
        
        Student an = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        
        Student binh = new Student("SE662204", "BINH LE", 2004, 0.9);
        an.showProfile();
        binh.showProfile();
        
        //chấm xổ gì, Access Modifier/ Acess specifier
        System.out.println("An name (directly): " + an.name);   //y chang cầu thủ dán tên sau lưng
        System.out.println("An name (directly): " + an.getName());
        
        //vì bạn sờ đc trực tiếp cái name/ biến/ instance variable, ta có thể get() và set()
        //an.name = "KHONG HOC BAI";
        Student.name = "CAY RANK KO CAY CODE";
        
        System.out.println("Binhname (directly):  " + binh.name);
        System.out.println("An name (directly): " + an.name);
        
        System.out.println("Student name (directly): " + Student.name);
        
        an.showProfile();
        //sayHi() mà sayHi() đang là static
        System.out.println("Using static");
        an.sayHi(); //ko tư hữu theo kiểu của riêng mình cho static
        binh.sayHi();
        Student.sayHi();    //Tên Class chấm static vì là đồ dùng chung multiple object
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức là chạm sờ STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                   đồ của riêng từng object
        //Math.
        
    }
}

//STATIC ĂN THEO THẰNG CUỐI CÙNG
