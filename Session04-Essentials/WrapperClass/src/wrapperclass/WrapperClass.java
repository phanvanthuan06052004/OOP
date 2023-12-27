/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrapperclass;

/**
 *
 * @author ACER
 */
public class WrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithInteger();
       // playWithIntegerPointers();
       playWithPool();
    }
    
    //CHÓT HẠ: KO SO SÁNH 2 BIẾN PBJET DÙNG > < =
    //                  CHẤM VÀO BÊN TROG ĐỂ SO SÁNH CÁC ĐẶC ĐIỂM LÕI
    //TA PHẢI VIẾT HÀM SO SNAHS 2 OBJECT() VÌ SAU NÀY CHẤM LẤY VLAUE LÕI RA SO SÁNH
    
    public static void playWithPool() {
        Integer num1 = 2001;
        Integer num2 = 2001;
        //num1 có bằng num2 ko ?? KO
        System.out.println("num1 vs num2" + (num1 == num2)); //FALSE 2 TỌA DỘ
        //lỗi num1 có bừng lõi num2 ko? CÓ
        System.out.println("num1 vs num2 (core): " + num1.equals(num2));
        if (num1.equals(num2))
            System.out.println("2 thang kia bang nhau trong loi");
        else
            System.out.println("den ca loi con khac nhau");
        
        //VI DIỆU
        Integer num3 = -127; //trỏ lõi -127
        Integer num4 = -127; //trỏ cùng, éo tạo new mới
        //Integer pool hồ bơi cho vùng new lõi có giá trị nằm trong đoạn
        //[-128 -> 127]
        System.out.println("XEM VI DIEU");
        System.out.println("num3 vs num4: " + (num3 == num4)); //true
        //vẫn so con trỏ heng, éo so sanhs lõi vì  biết lõi = nhau òi
        
        //RIÊNG CHO boxing từ -128 -> +127 thì
        //gói những thằng primitive/boxing tring đoạn này thì chúng
        //chỉ xài 1 vùng new Chung nếu chung lõi
        
        Integer num5 = new Integer(-129); //ÉO TẮM CHUNG
        //VÌ XÀI NEW RÕ RÀNG TƯỜNG MINH
        System.out.println("num3 vs num5: " + (num3 == num5)); //false
        
        //NẾU TA SO SÁNH 2 BIẾN WRAPPER, Integer a Integer b
        //a ==b lúc đúng lúc sai do có xài pool hay ko 
        //SO SNAHS 2 BIẾN OBJECT LÀ ĐIỀU KLO NÊN, KO ĐC LÀM VÌ NÓ KO MANG Ý
        //NGHĨA NÀO CHÍNH XÁC,
        //KHI SO SÁNH 2 BIẾN OBJECT/ MÌNH PHẢI CHẤM ĐỂ LẤY DATA BÊN TRONG MÀ
        ///MÌNH SO SÁNH, GỌI HÀM TRONG OBJECT
        
        //POOL CHỈ XẢY RA CHO WRQPPER, STRING 
        //CHỈ XẢY RA HẠN CHẾ Ở 1 SỐ TÌNH HUỐNG
        //NEW NGẦM MYA RA XẢY RA POOL KHI CHƠI GÁN PRIMITIVE -> PBJECT
                                                    //BOXING TRỰC TIẾP
        //                                          VÀ MIỀN GIÁ TRỊ
        
        //SO SÁNH 2 OBJECT CHÍNH LÀ SO SÁNH CÁC VALUE BÊN TRONG 
        //DATA Ở DÂU HÀM Ở ĐÓ, DO ĐÓ MỖI OBJECT SẼ NÊN CÓ HÀM SO SÁNH
        //VỚI KẺ KHÁC TRÊN 2 CAU HỎI: EQUALS() COMPARETO()
        //tớ.sovoi(cậu)   tớ.ccoBang(cậu ko)
        Double pi = 3.14; //boxing
        
    }
    
    public static void playWithIntegerPointers() {
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        //3 lệnh này tương đương value lõi
        //Hỏi: num1 có bằng num2 hay ko, hỏi num3 cũng oki??? 
        boolean result = num1 == num2; //kết quả phép toán ss là true/flase
        System.out.println("num1 == num2? " + result);
        //if (num1 == num2)
        //num2 vs. num3 thì sao??
        if (num2 == num3)
               System.out.println("num2 bang num3 nhe!!!");
        else
            System.out.println("num2 eo bang nunm3 vi di so snah toa do 2 vung new");
        
        Integer num4 = 2004;
        if (num3 == num4) //value lõi cùng nhau rồi
               System.out.println("num3 bang num4 nhe!!!");
        else
            System.out.println("num3 eo bang nunm4 vi di so snah toa do 2 vung new");
        //KẾT LUẬN: KO SO SNAHS 2 BIẾN OBJECT DÙNG TOÁN TỬ TRUYỀN THOOGNS > >= < <= == !=
        //VÌ CÁC BIẾN OBJECT BẢN THÂN NÓ CHỈ LÀ TỌA ĐỘ THAM CHIẾU 1 VÙNG NEW CÓ NHIỀU INFO
        //MÚN SO SÁNH 2 BIẾN OBJECT DÙNG TOÁN TỬ TRÊN TUONG ĐƯƠNG ĐI SO SANH S2 ĐỊA CHỈ
        //VỞ VẴN, AI ĐI SO SÁNH SỐ NHÀ LÀM GÌ
        //VÀO NHÀ XEM INFO MẦ SO SÁNH
        //VÀO VÙNG NEW INTEGER(..) LẤY VALUE LÕI RA MÀ SO
        //Á ĐÙ, VÀO VÙNG NEW INTEGER() LÀM GÌ ĐÓ, SO SÁNH VALUE HẢ
        //MÚN SO SÁNH 2 OBJECT/BIẾN OBJECT TA SẼ CHẤM ĐỂ....
        //                              GỌI HÀM SO SÁNH VALUE BÊN TRONG
        
        //Integer phảu có hàm so sánh cái lõi với nhau
        //hàm nằm trong Integer thì lấy value lõi
        //GL Rules: ai có nhiều info, gã đó có hàm xử lí
        System.out.println("num3 vs. num4 (core value): " + num3.equals(num4));
        System.out.println("num3 vs. num4 (core value): " + num3.compareTo(num4));
        System.out.println("num4 vs. num3 (core value): " + num4.compareTo(num3));
        
    }
    
    public static void playWithInteger() {
        int     num0 = 2003;  //tốn 1 vùng ram 4 byte đặt tên làm num0, ONOFF 2003
        Integer num1 = new Integer("2004"); //2 vùng ram, con trỏ, và new...
                                                //lõi vùng new có int value = 2003;
        Integer num2 = new Integer(2005);
        Integer num3 = 2006; //cách viết tiện nhất, gọn nhất, tự nhiên nhất
                            //thật tế là vẫn new Integer(2003);
        //cách ta lấy con só literal (số xh trong code) chính là primitive,
        //gói lại thành 1 vùng new mà nhân chính là primitive,
        //cách này gọi là ĐÓNG GÓI PRIMITIVE - BOXING A PRIMITIVE VALUE
        //BOXING: PRIMITIVFE -> WRAPPER OBJECT, THỨ ĐC ĐÓNG GÓI
        
        //sử dụng như bình thường
        System.out.println("num0: " + num0);    //xài trực tiếp vùng ram
        System.out.println("num0: " + num1);    //gọi thầm tên em
        System.out.println("num0: " + num2.toString());    //mở hộp lấy value int
        System.out.println("num0: " + num3.intValue());     //ra xài, UNBOXXING
        
        int num4 = num1; //HIỆN TƯỢNG MỞ HỘP, KO PHẢI ÉP KIỂU
                         //UNBOXING: TỪ OBJECT -> PRIMITIVE
                         //MỞ VÙNG NEW LẤY VALUE/NHÂN/LÔI GỐC PRIMITIVE
        System.out.println("num4: " + num4);                           
        
        Integer num5 = num0; //boxing, new ngầm Integer(2003)
        System.out.println("num5: " + num5);  
        
        //HỎI THẦY
        //int num0 đang = 2003
        num0 = 20010726; 
        //gán giá trị mới cho biến primitive, đè vào là xong, 1 vùng ram mà
        System.out.println("num0 again: " + num0);
        
        //num5 là biến con trỏ trỏ vùng new Integer(2003)
        num5 = 20210711; //ram điều gì diễn ra??
        //biến Integer mỗi lần = value mới primitive => new Integer(value mới);
        
        
        //VÙNG iNTEGER ĐC NEW KO CSO ÀM SET() CHỈ CÓ HÀM SET()
        //MÚN THAY ĐỔI NHÂN/LÕI, GÓI BÁNH MỚI ĐI, NEW MỚI ĐI
        //INTEGER LÀ OBJECT READ-ONLY
        //CLASS KO CÓ HÀM SỬA, CHỈ NEW XONG XÀI VALUE ĐÃ DỔ MÃI MÃI, ĐỔ 1 LẦN
        //KO SỬA, READ-ONLY OBJECT, ĐỌC ĐÚNG CHUẨN: IMMUTALBLE CLASS/OBJECT
          
    }
    //CÓ 8 CÁI CLASS TRAI BAO, WRAPPER CLASS (IMMUTABLE CLASS)
    //Byte, short, Integer, Long, Float, Double, Boolean, character
    //byte short    int     long  flaot   double   boolean  char
    //xài new cx đc, gán trực tiếp cũng oki(new ngầm)
}
