/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

//1. thấy có cái IS A, extendes

//2. Đặc điểm cho Con, đồng nhất (Cha lo hết) hoặc dị biệt, Con có riêng

//3. phễu, tôn trọng bản sắc

//4. Vì Cha là abstract, tức là chỉ nói hoy, chưa làm, chung chung thoi
//nên nếu Con ko chịu làm, tức là Con cũng chứa hàm abstract, thì Con
//trong tình huống này phải là abstract luôn
//1 CLASS CHỨA HÀM ABSTRACT KO CODE, THÌ CLASS ĐÓ PHẢI LÀ ABSTRACT
// VÌ NÓ TOÀN NÓI ĐIỀU CHUNG CHUNG, DÙ TRONG NÓ VÀI HÀM CÓ CODE

// Con thừa kế abstract class, mày có 2 lựa chọn, ko hơn
//-Hoặc mày abstract, nếu mày ko chịu viết code cho Cha, thừa kế abstract
//                              vậy mày là khái niệm luôn còn gì!!!
//-Hoặc mày phải viết code cho hàm abstract của Cha, vì mày đủ info để làm
// mày là cụ thể rồi, vì mọi thứ trong mày là rõ ràng
//  CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODS
//  implment the body of Parent' abstract methods
//Cha đã nói ý tưởng, Con hiện thực thôi
                    //làm biếng, mày giống Cha abstract, đời cháu tính
//Nếu ko chịu làm tiếp, mãi mãi là nói ko làm....-> hệ quả gì DÒNG HỌ 
//VÔ SINH, KO THỂ NEW ĐC 1 OBJECT TỪ CHA, CON LUÔN, VÌ CẢ 2 KO ĐỦ CODE
//KO SINH ĐC OBJECT DO KHUÔN KO HOÀN HẢO!!!!!!1


public class Rectangle extends Shape{
    protected double a, b;    //kết họp với phần làm biếng/ extendes từ Cha
                            //sẽ tái hợp đầy đủ như chưa có kế thừa

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor); //Cha phải có trước, làm cánh chim
        this.a = a;                       //Con bay xa, extends, dễ bố trí RAM
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%4s|%7.2f|\n", 
                            owner, color, borderColor, a, b," ", getArea());
    }
     
    
}
