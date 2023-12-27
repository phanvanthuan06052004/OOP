/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại heeng, ko có tự làm
//2. Khai báo các đặc điểm. LƯu ý:
//   2.1 Nếu con trùng hết với cha, ko cần làm lại, cha sẽ làm cho
//      giả  sử con cũng chỉ làm 2 tài sản (di truyền), ko cần khai báo gì cả
// 2.2 Con có đồ riềng, làm riêng, giấu ba, liệu rằng Ba có biết ko??
// biến dị
//Con làm thêm đc 1 loại tài sản , thay vì ba chỉ  có 2
//3. Làm phễu, giữ bản sắc cho con, thảo hiệp/ đàm phán/ deal nếu cần
public class Child extends Parent {

    private String assetThree; //Rectangle vs. Square(o, c, e)
    //                    o, c, e, smile

    //lí thuyết, con có 3 thứ: a1, a2, a3, phểu phải đổ cả 3, kế thừa Cha giữu 
    //new Con chính new Cha
    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);  //MUST BE 1ST STATEMENT
        this.assetThree = assetThree;
    }   //phải có Cha thì mới có ko gian cho Con mở rộng
    //BẮT BUỘC PHẢI NEW CHA TRƯỚC, MỚI EXTENDS ĐC, CÓ THÊM CHỖ MỞ RỘNG
    //ĐỂ LƯU THÊM PHẦN KHÁC BIỆT
    //BỐ TRÍ RAM CHO BA TRƯỚC, MỞ RỘNG CHO CON

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }

    @Override
    public void showProfile() {
        System.out.println("CHILD: asset1: " + assetOne +
                                 "; asset2: " + assetTwo + 
                                   "; asset 3: " + assetThree);
    }

    //hàm mới, hành dộng mới của Con, khác cha, Cha k có
    //ngoài đời có, Con vào SG đi làm thêm, đi đánh Game, đá banh,..
    //tập thể thao mạo hiển !!!
    public void sayHi() {  //gáy với mọi người
        System.out.println("hey, i am a ric kid");
        System.out.println("By the way, my 3rd asset is " + assetThree);
    }

}
//CON CÓ QUYỀN KHÁC TRÊN DD VÀ HÀNH VI VỚI CHA (NGOÀI KẾ THỪA & OVERIDE)
//DẤU CHẤM THÌ SAO
//KHAI CON NEW CON THÌ XỔ TẤT, ĐÃ BIẾT
//KHAI CHA NEW CON CHỈ XỎ CỦA CHA, KO CHỊU XỔ PHẦN KHÁC BIỆT, DÙNG DANH NGHĨA
//NGƯỜI LỚN, PHẢI HÀNH XỬ NHƯ NGƯỜI LỚN
//muốn xổ tất, kĩ thuật tổ lái con trỏ 
