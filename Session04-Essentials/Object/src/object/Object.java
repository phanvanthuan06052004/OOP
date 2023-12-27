/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object;

import data.Student;

/**
 *
 * @author ACER
 */
public class Object {

    public static void main(String[] args) {
        //checkObjectV6();
        Student ahihi = checkObjectV8();    //ahihi lưu tọa độ của AN trong hàm thảy ra ngoài
        ahihi.showProfile();
    }

    
    //hàm trả về 1 object hả thầy, ko
    //đọc chuẩn: hàm trả về 1 tọa độ của object nào đó, vì trả đc tọa độ nghĩa là
    //sờ đc object, có tọa độ chấm là tới object
    
    //             Student x;
    public static Student checkObjectV8() { //student x = sẽ là 1 vùng new
        
        Student x; 
        x = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        return x;   //Việt sub: x lưu tọa độ vùng clone AN, hướng 6M
                    //thảy tọa độ đó cho tên hàm, tên hàm là 6M, hướng 6M
    }
    
    public static void checkObjectV7() {
        Student x;  //khai báo biến, khai báo con trỏ, nhưng chưa trỏ tới ai
        //tao với mày nói về thằng x kia đi, ai dọ, tư từ sẽ nói
        
        int a;
        a = 10;
      
        x = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        //à nó đây nè
        // x = new()
    }

    public static void checkObjectV6() {
        //câu chuyện của sinh ra rồi chết non
        //câu chuyện vô dannh tên gọi
        //object ko thèm, ko có tên gọi, vẫn hành xử đc
        //Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        //               đã tương đương tọa độ rồi, thảy tọa độ đó đi đâu thoai
        //                  thảy cho biến object nào đó giữ giùm tọa độ
        //biến đó mà chấm nghĩa là tọa độ chấm, NGHĨA LÀ NEW CHẤM LUÔN
        //vì biến có tọa độ từ new. CHỐT HẠ: NEW NẮM TỌA ĐỘ
        //chấm là vào trong tọa độ xem có cái gì, trong object có gì

        new Student("SE666789", "AN NGUYEN", 2021, 8.9).showProfile();

        //ko thèm đặt tên cho object để giao tiếp, đẻ object tự giao tiếp
        //object vo danh, anonymous object, object was created without a nname, a reference
        //XUẤT HIỆN XONG, GẤY XONG, KHỐC XONG, GARBAGE COLLECTOR PHÁT HIỆN KO CON TRỎ
        //GIẾT, CLEAR
        //MÚN RE-USE LẠI VÙNG NEW, TỐI THIỂU ÍT NHẤT 1 TÊN GỌI, 1 BIẾN OBJECT
        //ĐỂ CÒN CHẤM TIẾP
    }

    public static void checkObjectV5() {
        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        Student x = s1;

        s1.showProfile();
        x.showProfile();    //backup tạo dộ new AN ở trên, thêm 1 con trỏ trỏ cùng, trùng
        //chứng minh 2 chàng trỏ 1 nàng
        //chàng 1 tát, chàng 2 thấy
        s1.setName("MINNH CHOI U TIM HENG");
        //trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI...
        System.out.println("After TAT");
        //hong thèm hỏi s1, hỏi luôn x xem sao
        x.showProfile();

        //nhiều tên cùng tham chiếu 1 object:
        //tí, tèo -> (Mìn...)
        //hoàng, gi, xàm, đa cấp,cp -> (tui)
        //
        //cùng 1 tên ám chỉ nhiều object khác
        //sếp = ST
        //sếp = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN,THAM CHIẾU
    }

    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        Student x = s1; //mày là biến lưu tọa độ vùng new, cho tao tọa độ đi
        //nếu tao tự new như mày, hg lẽ, sai, ra vùng clone mới
        //int a = 10;
        //int b = a;    //cho tao value của mày, tao muốn lấy value của mày
        //trước khi s1 trỏ tọa độ mới, backup tọa đọ cũ là xong
        //giữ lại đc AN
        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.5);
        s1.showProfile();   //LP
        x.showProfile();    ///AN đã trở lại, backup tọa độ new vào biến khác cùng kiểu

        //int a = 10; a = 100;
    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);

        s1 = new Student("SE666788", "LOC PHAT", 1998, 8.5);
        //con diều an đứt dây
        //vì sợi dây đã nối với con diều mới LP

        //s1 li dị vùng clone AN, chuyển sang kết nối với LP
        //ống nhòm dòm sang chỗ mới, con trỏ lưu tọa độ mới, biến thay đổi value
        //lưu value gần nhất
        //int a=10 , a=100 // hỏi a bằng  mấy :100
        //S1 là biến object
        //tui cần lắm luôn 1 tọa độ vùng new, vùng clone Student
        s1.showProfile();// LP

        //mất tọa độ vùng clone AN
        //vùng ram ko ai trỏ tới, thì định  kì khi chạy app, JVM(phần chạy // window
        //sẽ kiểm soát app bạn) giết/ clear vùng clone ko có con  trỏ
        //cờ hó chạy ngoài đường ko chủ, exciter hốt
        //cty MTĐT, JVM có đoạn code, module giám sát HEAP, xem có đứa nào mồ côi ko, ko có con trỏ
        //giết ngay và luôn đê ((độ trễ if any) ---free(con trỏ bên C chơi malloc())
        //anh giám sát này gọi tên là Garbage Collector, người gom rác, CTMTĐT
        System.gc();    //gom rác HEAP
        //ngoài đòi có gán lại con trỏ, tên tắt cho thứ phức tạp
        //sếp = CS ST(..)
        //chết cha sếp kìa, sếp = (ông, gã chấm lương cho mình, qđ miinhf tăng lương hay ko)
        //tí = mày, tao ở nhà ba má gọi
        //tí = Ngô thanh Vân & câu truyện trạng Tí

    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);

        Student s2 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        s1.setName("AI ROI CUNG KHAC");
        s1.showProfile();
        s2.showProfile();
        //một new 1 clone, 2 sv khác nhau, 2  vùng ram khác nhau
    }

    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYEN", 2021, 8.9);
        //reference var         object, vùng ram bự trong HEAP
        //object    var         instance, thể hiện, hiện thân, bực tượng
        //"pointer"  var
        s1.showProfile();
        //             s1 đang nắm/ lưu tọa độ vùng ram object trong HEAP
        //                  new làm cực kì nhiều việc
        //                      1. clone khuôn(object và static)
        //                      2. gọi phểu đổ data vào vùng clone
        //                      3. chốt lại tạo độ vùng new vừa rồi, đem tạo độ đi gắn biến con trỏ

        //s1 là biến, vậy nó có thể thay đổi value!!!
        //sếp đang trỏ đến casi Sơn Tùng
        //sếp với người đi làm, trỏ đến ông/ bà quyết định lương cho mình
        //sếp tham chiếu đến người này người kia
        Student x = s1; //2 con trỏ cùng vùng new, 2 chàng trỏ 1 nàng

        s1 = new Student("SE666788", "BINH LE", 1998, 8.8);
        //LI DỊ AN

        System.out.println("s1 now is BINH");
        s1.showProfile();

        System.out.println("AN after s1 tu choi choi");
        x.showProfile();        //AN CŨ À NHEN

        //AN NGUYỄN KO CÒN AI TRỎ, KO CÒN CÁCH NÀO LẤY LẠI ĐC VÙNG RAM NÀY
        //TỌA ĐỘ NEW CŨ TA KO GIŨ LẠI
        //biến object là tay cầm con diều, new chính là con diều
        //khi tay cầm nối dây con diều mới, con diều củ ko còn chơi nữa, đức dây , bay mất 
        //1 vùng ram new object mà ko còn ai trỏ tới, JVM có chương trình ngầm gọi là
        //CT MTĐT, GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW MỒ CÔI KO CON TRỎ, DỌN FREE RAM
        //trả lại ram ko xài cho new sau này
        //1 biến có quyền trỏ vùng new, giữ lại AN đc ko, mà vẫn có BÌNH
        //VI DIỆU, VỀ NHÀ SUY NGHĨ ĐIỀU GÌ XẢY RA, HĂC NÃO 1 TÍ
        new Student("SE666780", "Dai GIA", 2003, 9.5).showProfile();
    }

}
