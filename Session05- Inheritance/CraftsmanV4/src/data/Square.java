/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
//nên thừa kế ai??
//Shape: khai báo cạnh edge, phễu (super, éo thỏa hiệp, đảo thứ tự biến nếu mún
// get/ set()
//BẮT BUỘC PHẢI IMPLEMENTS

//Ngon: kế thừa mẹ nó Rectangle
//                              ko cạnh, phễu thỏa hiệp tí, XONG, ÉO LÀM GÌ
//                                  CÙNG LẮM LÀ SỬA PAINT()
//                              Shape là Ông nội, cây gia phả xuất hiện
public class Square extends Rectangle{
    
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
        
    }
    //DONE, KO LÀM GÌ NỮA, HCN CÓ ĐỦ RỒI, OWNER, COLOR KÌA, 2 EDGE EDGE BÊN CHA
    //MÀY MÚN IN KIỂU SQR THÌ MÀY OVERSIDE BA GẦN MÀY ĐI, HCN
    @Override
    public void paint(){
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%4s|%4s|%7.2f|\n", 
                            owner, color, borderColor, a," "," ", getArea());
    }
}
