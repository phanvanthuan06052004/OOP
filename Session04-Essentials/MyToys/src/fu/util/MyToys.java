
package fu.util;

//đây là class, khuôn, chứa, có đặc điểm/ hành động/ chứa các món đồ chơi dùng chung

import java.util.Scanner;

//cho mọi nơi- vì nó ko nhớ cái gì cho riêng tư của nó
//LIBRARY/FRAMEWORK -chứa các hàm/ biến(data) dùng chung cho nhiều công việc khác nhaui
//của các dự án khác nhau
public class MyToys {

    //đặc điểm/ hành vi là static, cho người ta sờ thì thêm public
    //ko nhớ cái gì của riêng mình
    //Một class bt thì vẫn có thể vừa static vừa non- static, tùy nhu cầu, cách thức
    //Math: hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết statiic
    public static final double PI = 3.15;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENT = 500;
    
    //final -const bên C, biến ko cho thay đổi vcalue, trừ lần đầu tiên khai báo 
    //HẰNG SỐ
    
    //đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta, tại sao ko??
    private static Scanner sc = new Scanner(System.in);
    //private cho nhu cầu dùng nội bộ bên trong
    //FAP, LMS
    
    //DI: Dependency Injection
    //Double.parseDouble()
    //                                       tb nhập, errorMsg, lower, upper
    public  static int getAnInteger(String inputMsg) {
        int n; //hứng từ bàn phím goc gì
        
        do {            
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1.....6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know hơ to input an integer ?");
            }
        } while (true);
    }
    //trong quá tình làm app, việc nhập số là gặp lại nhiều lần
    //nhập 2 của 1 HCN, 3 cạnh 1 TG, nhập sự lựa chọn menu 1...5, điểm tb, điểm thi các môn
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try - catch - do - while    
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng kết quả trả về từ hàm, lấy dễ dùng, MyToys nhớ con số này làm gì, STATIC thượng sách
    
    public  static int getAnInteger() {
        int n; //hứng từ bàn phím goc gì
        Scanner sc = new Scanner(System.in);
        do {            
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1.....6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know hơ to input an integer?");
            }
        } while (true);
    }
    
            
}
