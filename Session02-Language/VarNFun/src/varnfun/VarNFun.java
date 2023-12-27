/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varnfun;
//~~~#include<studio.h>
import java.util.Scanner;


public class VarNFun {

    
    public static void main(String[] args) {
        getAPositiveInteger();
        printInterList(n); //truyền tham trị, pass by value
                            //valuetuwfuwf n của hàm main() sẽ đc đưa qua ngõ/ ngả
                            //phễu máy xay, n main() đập ngang sang n của hàm

                            //OOP pass by reference - truyền tham chiếu
                            //                         con trỏ, địa chỉ
        printInterList(400);        //hard-code đầu vào, code cứng/ cố định value/literal
                                    //hog ềm mại linh hoat,
                                    //linh hoạt: bạn muốn in đến mấy??? hỏi và nhập
        //printInterList();
        //playWithBooleans();
        //playWithCharacters();
        //playWithDouble();
        //playWithIntegers();
        //playWithVariable(); 
    }
    
    public static int getAPositiveInteger() {
        int n;
        //nhập từ bàn phím, xài kĩ thuâật OOP, chấm bung lụa, name.charAT()
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input a positive interger: ");
        n = banPhimCuaTui.nextInt();
        return n; //getAPositiveInteger() = n
    }

    //tui mún in n số tự nhiên tính từ 1
    //Hiện tượng 1 class bất kỳ chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khác trên data type chứ ko phải khác trên tên biến
    //ĐC HỌI LÀ OVERLOAD/OVERLOADING - quá tải hàm
    //vs. OVERRISE
    //POLYMORPHISM -> ĐA HÌNH
    //giống như: 5 anh em trên 1 chiếc xe wave
    public static void printInterList(int n) {
        //chỉ có thằng ngáo mới scanf(n) here!!!n đã có value khi xài
        //body of funct. Nghiền, trộn xử lí ới đầu vào giá định sẽ đưa qua tên gọi
        //giải quết trên công thức
        System.out.println("the list of " + n + " first intergers");
        for (int i=1; i<=n; i++){
            System.out.printf("%d", i);
            //System.out.print(i +" ");
            System.out.print(" ");
        }

    }
    public static void playWithBooleans() {
        //C: đúng 1, >0, sai 0, int
        //java: đúng: true, sai: false, -> boolean
        boolean marriedStatus = false;
        if (marriedStatus == true)
                System.out.println("Đánh đồn có địch mới vui");
        else
                System.out.println("vườn hồng");

    }
        
    public static void printInterList() {
        //in ra các số tự nhiên từ 1 đến 100
        System.out.println("the list of 100 first intergers");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18....");
        for (int i=1; i<=100; i++){
            System.out.print(i + " ");
        }
    }
    
    
    public  static void playWithCharacters() {
        //2 byte cho kiểu char heng, lưu bảng mã Unicode
        char m = '$';
        System.out.println("Unit: " + m);
        //tên em thì sao? C: mảng kí tự, ko primitive nữa rồi, phức tạp rồi
        //                  char name[] = "Ahihi"

        String name = "Phan VĂn Thuận"; //loại data type mới hoàn toàn
                                        //phức tạp, do gom n thứ khác
                                        //object data type, học sớm hoi
        System.out.println("My name: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        //C: string.h  -> strlwr().....
    }
    public  static  void playWithDouble() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n",  pi);   //cấm tuyệt đối ko dùng %lf

        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    public static void playWithIntegers(){
        int n = 39;     //mọi con s, kí tự xuất hiện trong code đc gọi là
                        //literal value
                        // số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);

        long m = 3_000_000_000_000L;    //_ phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m);

        int Status = 0xFA;   //hệ 16
        System.out.println("Status: " + Status);

        int phone = 010; //0 hệ 8 octal
        System.out.println("phone: " + phone);

    }
    public static void playWithVariable() {
        //biến là 1 vùng ram được đặt tên chiếm 1 số bye nhất định tùy loại
        //dữ liệu thông tin mà nó sẽ chứa bên trong
        //số, ảnh, chữ,...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị -đơn, phức
        int age = 20;
        int a = 10, b;
        b=100;
        //tốn 12 byte trong RAM
        System.out.println("age: "  + age);
        int yob = 2004; //year of birth
        age = 2023 - yob;

        System.out.println("age agane: "  + age);

        System.out.println("age agane: "  + (2023 - yob));

        System.out.printf("age printed by using %% as in c: %d\n", (2023 - yob));
    }
    
}
