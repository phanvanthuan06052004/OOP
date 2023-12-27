/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
//HV là phiên bản đb cảu HCN, độ lại tí, độ lại 2 cạnh kề = nhau
//komaast đi bản sắc HCN 4 góc vuông
//HV là sự mở rộng, nâng cấp, đặc biệt hóa, phiên bản mới, sự điều
//chỉnh/thay đổi nhỏ từ HCN
//cách chế tạo Khuôn mới từ khuon cũ, kế thừa, dùng lại, đứng trên vai...
//KO PHẢI LÀ COPY&PASTE
//Phiên bản cũ là mình làm các khuôn từ đầu, ko kế thừa, sp cho nhau
//ko cùng 1 nhà đc

//1. mới A extends cũ B:
//                      HCN khuôn gốc để độ: class Cha, parent, super, base
//       HV                 kế thừa từ HCN: class Con, child, sub, derived
                                                        //biến hình, chế ra từ
                                                        //xuất phát từ
//2. đặc điểm của con là gì?
//                  vì HV là (phiên bản ) HCN, nên nó sẽ có tất cả mọi thứ từ HCN
//KO CẦN LÀM LẠI CÁC FIELD/ INSTANCE VARS

//3. cần phễu, để đúc phiên bản mới, cần vật liệu đưa vào, gửi cha giữ, đổ lên
//cha, vì có mọi thứ từ cha, phiên bản gốc
//tôn trọng bản sắc Con, con HV, o , c, edge, only edge
//code tự sinh ra nó sẽ căn theo phễu của cha, 4 tham số, đẻ đỗ đc 4 tham số
//                                  phễu con phải 4, CHẾT, MẤT BẢN GỐC
//                                                                      EDGE

public class Square extends Rectangle{
    
    public Square(String owner, String color, double edge){
        super(owner, color, edge, edge); //HV có cạnh edge là HCN 2 cạnh edge edge
    }    //new rectang le(o,c,w,l);
        //new HV chính là new HCN
    //new HV chính là new 1 phiên bản HCN
    //cắt 1 hv bản chất là cắt 1 HCN
    //          có color, own, cạnh -> HCN dưới dạng HV cũng là thế mà
    
//    private String owner;
//    private String color;
//    private double odge;
   //VỀ LÍ XONG KHUÔN VUÔNG, VÌ ĐỒ DATA NHƯ TRUYỀN THỐNG, DÙNG LẠI HẾT CỦA cn
    //KO CẦN VIẾT LẠI CODE, KO COPY & PASTE
    //KO CHỈNH SỬA DÂY CHUYỀN SX QUÁ NHIỀU, TẤT NHIÊN ĐANG CÙNG DÒNG SP, SERIRES
    //DÍNH ĐẾN 1 KHÁI NIỆM GỌI LÀ TÍNH ĐA HÌNH, ĐA XẠ, ĐA KẾ THỪA
    //ĐA NHÂN CÁCH, ĐA SẮC THÁI, 50 SẮC THÁI, BIẾN HÌNH, TRASFORMER
    //POLYMORPHISM
    //HIỆN TƯỢNG CON QUA MẶT CHA, THỂ HIỆN BẢN SẮC CẢU CON, CHA NGỒI IM ĐỂ CON
    public void paint(){   // 10 x 10 = 100.00   50 x 50  = 2500.00
        System.out.printf("|SQUARE |%-15S|%-10S|%4.1f| - |%7.2f|\n",
                owner, color, width, getArea());
    }
}

//CON XÀI TÁT CẢ NHỮNG GÌ CHA CÓ, CHA CÓ THÊM, CON CÓ THÊM, CHA BỚT, CON BỊ BỚT
//KẾ THỪA/DI TRUYỀN/CHO CON - INHERITE

//BIẾN DỊ, CON KHÁC. THÊM BỚT MÀ CHA KO CÓ, KO PHẢI OVERIDE (XIN PHÉP CHA CON
//THEO KIỂU GIỐNG CHA, TÊN HÀM GIỐNG, ĐỂ CON PHÁT NGÔN THAY)
//CON SÁNG TẠO MỚI, LAN ĐỘT BIẾN
