/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Shelf {

    //đặc điểm cái tủ là gì???
    private String color;
    private String lable;

    //đặc điểm chính cần focus
    //dung lượng, không gian chứa của cái tủ là bao nhiêu???
    //nhiều cách khác nhau
    //1. đóng sẵn kích thước
    //2. theo yêu cầu (đưa ra yêu cầu, đưa ngẫu nhiên)
    private Student[] arr = new Student[500];   //sẵn kích thước
    //logic mảng: cần có kích thước, chừa chỗ sẵn
    //value từng phần tử, từng món đồ từ từ tính
    //khi chơi với mảng, phải biết for đến đấu, co ichuwngf null pointer
    //ad vào tủ từ từ trái sang phải
    //ta cần 1 biến count nói về số luuowngj đang có trong mảng
    //sure no static
    private int count; // = 0

    private Scanner sc = new Scanner(System.in);
    //NON-STATIC CHO NHỮNG ĐẶC TÍNH Ở TRÊN

    //constructor làm những việc gì: đổ info vào
    //bài này mình đổ màu sắc, tủ dùng cho vieeccj gì (lable)
    //đặt hàng dung lượng, hoặc fix dung lượng
    //CÂU HỎI: sao em ko đưa hồ sơ thật sv vào???
    //mua tủ về phải trồng, nhét hồ sơ thật vào từ từu hợp lí hơn
    //nhét ngay 1 lần hết hồ sơ vào tủ là ko thực tế...
    //bỏ hồ sơ vào tủ thực sự đc lặp đi lặp lai nhiều lần với cái tủ
    //hàm thêm hồ sơ nằm ở cái tủ hợp lí: ai có nhiều info, kẻ đó xử lí
    //addsv() xoasv() ....
    public Shelf(String color, String lable, int count) {
        this.color = color;
        this.lable = lable;
        //this.count = 0;  //mới mua tủ thì chưa có hồ sơ cụ thể
        //có thể đưa qua con đường phễu, nhưng ko hay, vì đây là thứ người dùng
        //khi mua tủ ko cần biết, họ chỉ cần biết khả năng chứa tối đa
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    //hành động add mới hồ sơ sv lặp lại cho mỗi cái tủ, 1 cái kệ, app đk member
    public void addAStudent() {
        //chơi for vỡ mặt, phải là từ từ, vì nó sẽ đc liên tục bổ sung theo
        //quy trình  cty, cách bạn làm với cái tủ
        int yob;
        String id, name;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        
        System.out.println("Input id: ");
        id = sc.nextLine(); //TODO: TÊN RỖNG //CHECK TRÙNG ID
                            //CÒN TRÙNG CÒN NHAPAJ LẠI, Y CHANG ĐĂNG KÍ MEMBER
        
        System.out.println("Input name: ");
        name = sc.nextLine();
        
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr[count] = new Student(id, name, yob, gpa);
        count++; 
             
        //bao nhiêu lần mở tủ adđ() hồ sơ, bấy nhiêu lần count tăng lên,....
    }

    //y chang xem dnah sách số kênh đã add vào cái tivi
    public void printStudentList() {
        System.out.println("There is/ are " + count + " Student(s) in the list");
        //    for (Student x : arr) {
        //       x.showProfile();
        //coi chừng null pointer
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();

        }
    }
    
    public void searchAStudent(){
        //đưa id vào từ bàn phím, tìm sv theo id
        //for từ đầu đến count của mảng, lôi từng sinh viên ra hỏi, mã số của ku là gì
        //so sánh với id gõ vào, == nhau thì done, tìm ra sv ở vị trí i
        String id;
        System.out.println("Input student id that you want to search");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getID().equalsIgnoreCase(id) == true) {
                System.out.println("Student  found!!! Here she/he is");
                arr[i].showProfile();
                return; //thoát hàm luôn, vì mã số sv duy nhất, thấy rồi
                //ko còn ai để for thêm làm gì
            }
        }
        System.out.println("Student not found!!!");
    }
}


//    //đặc điểm của 1 cái tủ bất kì là gi: màu sơn:___; giá tiền:___; nhà sx:___
//    //số ngăn/ ko gian chứa đồ:___các món đồ nhét vào, món đồ là object
//    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
//    //tủ sẽ chứa 1 list/mảng/danh sách các dối tượng
//    //ứng dụng của mảng, góp phần tạo dựng nên object khác
//    //OOP: tìm các object, chúng phối hợp, trộn nhau
//    private String color;
//    private String lable; //tủ chén, tủ hồ sơ SE, IA, GD, JP
//
//    //chứa cái gì
//    private Student[] ds = new Student[300];
//    private Scanner sc = new Scanner(System.in);
//    private int count = 0; //mới mua tủ về, số hồ sơ = 0
//    //nhét thêm  1 hồ sơ thì count+++
//    //chơi mảng chỉ for đến count
//
//    //tui có ko gian chưa info, tui sẽ giải quyết chuyện nhập xuất
//    public Shelf(String color, String lable) {
//        this.color = color;
//        this.lable = lable;
//    }
//    //public void inputAStudent() {
//        Scanner sc = new Scanner(System.in);
//        String id, name;
//        int yob;
//        double gpa;
//        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
//        System.out.println("Input id: ");
//        id = sc.nextLine();
//        System.out.println("Input name: ");
//        name = sc.nextLine();
//        System.out.println("Input yob: ");
//        yob = Integer.parseInt(sc.nextLine());
//        System.out.println("Input gpa: ");
//        gpa = Double.parseDouble(sc.nextLine());
//        ds[count] = new Student(id, name, yob, gpa);
//        count++; //SIÊU VIP
//    }
//    //public void printStudentList() {
//        System.out.println("The student List");
//        for (int i = 0; i < count; i++) {
//            ds[i].showProfile();    //FOR HẾT LÀ TOANG!!!!
//        }
  //  }
