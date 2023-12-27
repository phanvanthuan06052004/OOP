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
//COn làm thêm đc 1 loại tài sản, thay vì Ba chỉ có
//3. Làm phễu, giữ bản sắc cho con, thảo hiệp/ đàm phán/ deal nếu cần
 
public class Child extends Parent{
    
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfile(){
        System.out.println("CHILD: asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    //hàm mới, hành dộng mới của Con, khác cha, Cha k có
    //ngoài đời có, Con vào SG đi làm thêm, đi đánh Game, đá banh,..
    //tập thể thao mạo hiển !!!
    public void sayHi() {  //gáy với mọi người
        System.out.println("hey, i am a ric kid");
    
    }
}
