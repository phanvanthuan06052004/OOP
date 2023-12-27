/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.*;

/**
 *
 * @author ACER
 */
public class Cabinet {
    //Tủ sẽ có nhiều ngăn chứa nhiều món đồ. Ta xài mảng, ArrayList, Collection
    //để lưu trữ đồ
    //từ từ các bạn sv đến nhaaph học nộp hồ sơ và ta cất vào tủ arr

    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    //làm biếng làm phễu luôn, mọi thứ sẽ là default, Túi từ từ đc adđ() vô
    // mình ko chơi trò mua Tủ có sẵn luôn 1 cái Túi, trong Túi có sẵn hồ sơ!!
    //nếu mún làm, thì new sẵn túi bên ngoài, có sv sẵn đưa vào trong tủ , oki

    //default/empty construct. Ko làm gì cả
    public Cabinet() {
    }

    //hành động của cái tủ là thêm hồ sơ, tim hs, sắp xếp hồ sơ, xóa hs, update hs
    public void addStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input Student profile #" + (arr.size() + 1) + ": ");

        //DÙNG LẠI HÀM SEARCH ĐỂ KIỂM TRA COI ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ CHƯA
        //CẤM TRUNG ID - BÊN DB GỌI LÀ PRIMARY KEY - KHÓA CHÍNH CẤM TRÙNG
        //TƯƠNG ĐƯƠNG ĐK MEMBER, LOGIN NAME, ACCOUNT NAME CHỬI TRÙNG ÉO CHO ĐI TIẾP
        //CÒN TRÙNG LÀ CÒN CHỬI, ÉO CHO ĐI TIẾP - VÒNG LẶP
        while (true) {
            System.out.println("Input id: ");
            id = sc.nextLine().trim().toUpperCase(); //cắt trắng dư, đổi qua HOA
            //String là obj, vùng new, học sau
            Student xxx = searchAStudent(id); ///id vừa gõ kiểm tra liền
            if (xxx == null) //id éo tồn tại trong giỏ, thoát, đi tiếp
            {
                break;
            } else {
                System.out.println("Duplicated id. Try with another one!!!");
            }

        }
        System.out.println("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));

        System.out.println("The new Student has been added successfully");

    }

    public void prinStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The Student List is empty. Nothing to print");
            return;
        }

        System.out.println("There is/are " + arr.size() + " Student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //ta làm hàm tìm kiếm sv: đóng 2 mục đihcs:
    //1. phục vụ tính năng tìm 1 sv tho id
    //2. phục vụ thêm cho cái việc kiểm tra d có trùng hay ko kkhu tạo mới
    //   1 hồ sơ sv
    //hàm search() có 2 cách trả veeff: trả về vị trí tìm thấy trong Túi/int pos
    //trả về 1 object/ tọa độ của object/ tham chiếu
    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        } //nếu thấy sv, trả ngay cái thẻ thứ i tham chiếu vùng new có chứa id tìm

        //đi hết vòng for ko rẽ ỏe trên, sure ko tồn tại
        return null;

    }

    //hàm bao hàm search ở trên
    public void searchAStudent() {
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is");
            xxx.showProfile();
        }
    }

    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }

    public void updateAStudent(String id, double newGPA) {
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND! Nothing to update ");
            return;
        }
        //xxx.setGPA(newGPA);
        updateAStudent(xxx, newGPA);

    }

    public void updateAStudent() {
        String keyword;
        double newGPA; //CHỬI NHIỀU SV, GIÁ TIỀN KIỂU INT

        System.out.print("Input the student id you want to update info: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);

        if (xxx == null) {
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        } else {
            System.out.print("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine()); //MyToys
            updateAStudent(xxx, newGPA);
        }
    }
//    public void updateAStudent() {
//        String keyword;
//        double newGPA; //CHỬI NHIỀU SV, GIÁ TIỀN KIỂU INT
//
//        System.out.print("Input the student id you want to update info: ");
//        keyword = sc.nextLine();
//        Student xxx = searchAStudent(keyword);
//        if (xxx == null) {
//            System.out.println("NOT FOUND! NOTHING TO UPDATE");
//        } else {
//            System.out.println("FOUND. Here she/he is before updating");
//            xxx.showProfile();
//            System.out.print("Input a new gpa: ");
//            newGPA = Double.parseDouble(sc.nextLine()); //MyToys
//            xxx.setGpa(newGPA);
//            System.out.println("FOUND. Here she/he is after updating new gpa");
//            xxx.showProfile();
//        }
//    }
}

//CRUD - CREATE - RETRIEVE/READ - UPDATE - DELETE