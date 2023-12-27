/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author ACER
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithparentNChild();
    }
    public static void playWithparentNChild() {
        Parent p = new Parent("BIET THU", "100BTC");
        p.showProfile();
        //KHAI CHA NEW CHA, CHẤM Xổ ra gì?? xổ cái gì của cha
        
        
        
        Child c1 = new Child("NHA PHO", "100ETH");
        c1.showProfile(); // nếu ko làm đồ riêng, đó là lúc xài lại đồ của ba
        //phải theo quy tắc của Cha
        //nếu muốn qua mặt, còi to cho vượt, hãy tự làm đi, @overide
        //KHAI CON = NEW CON, chấm xổ ra gì??? xổ hết cảu con
                                            //xổ hết của Cha + xổ cảu riêng Con(@ + BIẾN DỊ)
                                            
        //KHAI GÌ NEW NẤY, XỎ CÁI NẤY, XỔ TÁT CẢ CỦA KHUÔN MÀ TA KHAI BÁO
        c1.sayHi();
        
        //cú chót, KHAI CHA NEW CON, ĐỌCC THEO KIỂU KẾ THỪA, GÁY NGOÀI ĐƯỜNG
        //MÀY BIẾT CON AI KHÔNG, BA TAO KO VỪA ĐÂU, DÙNG DANH NGHĨA DÒNG HỌ 
        //KHẨU KHÍ CỦA DINGF HỌ, CHA, CHỨ KO PHẢI MÌNH
        Parent c2 = new Child("CAN HO CAO CAP", "DOGECOIN");
        c2.sayHi();
        //Chỉ xổ ra những gì của Cha, ko xổ ra của riêng COn
        //riêng Con có 2 thứ: @ và khác biệt hoàn toàn
        //nếu Con có trùng Cha tên hàm, vẫn gọi Cha nhưng chạy COn
        //
        //đang dùng danh nghĩa Cha, thì cư xử như Cha, Cha éo có hàm sayHi() lấy
        //gì mà xổ, trong RAM vẫn cóc sayHi() đấy, vì new Child() có sayHi() 
        //clone khuôn Chiuld như nhau, quan trọng con trỏ
        
        //list<Student> list = new ArrayList();
        //cha                   con
        
        //KĨ THUẬT CHẠM VÀO THỨ RIÊNG TƯ CỦA CON
        //BA KO BIẾT TỎNG SG CON LÀM GÌ, VẬY LÀM SAO BA CÓ THỂ BIẾT??
        //DÙNG KĨ THUẬT DRIFT CON TRỎ
            
    }
}
