package dogmanagement;

import data.Dog;


public class DogManagement {

    
    public static void main(String[] args) {
        // biến value đơn
        int yob = 2001;
        Dog ChiHu = new Dog("CHI HU HU", 2021, 0.5) ;
        ChiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 8.9);
        ngaoDa.bark();
        
        //tui muốn show toàn bộ info của tui, theo cách toString()
        //object có nhiều hành động
        System.out.println("Show all info by using toString() a new behavior");
        
        String chDetail = ChiHu.toString();
        System.out.println("CH detail" + chDetail);
        System.out.println("ND detail" + ngaoDa.toString());
        
        //hàm toString() rất đặc biệt, @override
        //mục tiêu là show ra all ò into đã đổ vào, hoặc chỉnh sửa
        //y cahng như mở Setting trong phone xem phần info đt
        
        System.out.println("Play with toString() - GỌI THẦM TÊN EM");
        System.out.println(ChiHu);  //chiHu là biến object, lưu tọa độ vùng new
                                       //lí thuyết inra địa chỉ, thực tế J thì gọi tostring() ngầm
        System.out.println(ngaoDa); //gọi thầm tên em toString()
        
        //NẾU KHUYOON KO CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐC TRIỆU GỌI (GỌI THẦM)
        //HAY GỌI TRỰC TIẾP, JVM, SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
        //ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //HASH NUMBER, NÉM TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256....
        
        //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        System.out.println("ND age: " + ngaoDa.getAge());
        
        
//        int a = 100;
//        printf("a: 5\n", a); ->100 vùng ram có primitive mấy, value mấy
//        printf("a address: %u\n", &a); //vùng ram này ở đâu vậy, tọa độ, địa chỉ mày
//        int* p = &a;    //p lưu tọa độ a, gọi là con trỏ, vì tao nhắm tọa độ nhà mày
//        printf("p has value of %u|n", p) ->địa chỉ a, 6M
//        printf("a has value of %u|n", *p) ->100
    }

}
