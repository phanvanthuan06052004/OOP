/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringclass;

/**
 *
 * @author ACER
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithString();
    }

    public static void playWithString() {
        //Tuần sau là tuần đầu tiên của HKI Summer 2021
        //ko có tiền thì cạp đất mà ăn à (NT)
        //Vạn lời khuyên sẽ trỏ nên vô nghĩa nếu bạn ko chủ động bắt đầu để làm
        //hãy vượt sướng để thành công!!!!
        //có 4 dòng chữ, 4 object
        //Mô tả đc: rất nhiều chữ, độ dài diongf cchuuwx:??
        //             gồm các kĩ tự nhân loại đang dùng
        //-> thuộc 11 nhóm String class String xuất hiện 

        String s1 = new String("HELLO");
        String s2 = new String("HELLO"); // new Integer (2003); ko khuyến khíc

        //nhìn ko tự nhiên
        String s3 = "HELLO"; //new ngầm
        String s4 = "HELLO"; //new ngàm  ==Integer x = 2003;
        //POOL HỒ BƠI TẮM CHUNG, s4 trỏ cùng new s3, 2 chàng 1 nàng
        //POOL PHÂN BIỆT HOA THUÒNG
        //VẤN ĐỀ BIẾN NÀO NEW TRƯỚC POOL BIẾN SAU NẾU MÚN XÀU ĐÚNG DATA ĐÓ 
        //CHO XÀI KÉ, CỨ GIÁN = "HELLO" mày ko dc new, xài chung vơi tao
        ////tắm chung, trỏ cuung

        String s5 = "Hello";
        String s6 = "Hello";
        

        //hỏi s1 có bằng s2 ko 
        if (s1 == s2) ///2 tọa độ new khác nhau - CÓ NEW CÓ VÙNG OBJECT MỚI
              System.out.println("s1 bang s2");
        else
            System.out.println("s1 EO BANG s2");
        
        //hỏi s3 có bằng s4 ko 
        System.out.println("s3 vs s4?" + (s3 == s4)); 
        
        //hỏi s2 có bằng s3 ko 
        System.out.println("s2 vs. s3?" + (s2 == s3));
        
        //hỏi s4 có bằng s5 ko 
        System.out.println("s4 vs s5 " + (s4 == s5));
        
        //KO SO SÁNH 2 OBJECT QUA == MÀ PHẢI CHẤM VÀO BÊN TRING LẤY VALUE ĐI SO 
        //CÁC OBJECT NÊN LÀM SẴN SO SÁNH BÊN TỎNG CHÚNG ĐỂ ĐI SO SNHS
        //VỚI ĐỨA KHÁC
        //SO SÁNH OBJECT PHẢI CHẤM
        //2 LOẠI CÂU HỎI: equals() comparetor()
    }
}
