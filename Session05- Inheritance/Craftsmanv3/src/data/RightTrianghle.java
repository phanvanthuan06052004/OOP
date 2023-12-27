/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class RightTrianghle extends Triangle{

    public RightTrianghle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }   //new Con chính là new 1 phiên bản CHa
    //cắt TGV chính là cắt 1 TG
    //supper() chính là cắt 1 TG
    //cứ new TGV thì chính là new 1 phiên bản TG, new này gọi new kia
    
    //IN THEO CÁCH CỦA MÌNH, THÌ PHẢI TỰ LÀM, NEEUUS KO THÌ PHẢI XÀI KẾ THỪA BA MÁ
    //THÌ PHẢI THEO QUY TẮC CUA BA MÁ
    
    @Override   //còi to cho vượt, mún qua mặt cha
     public void paint(){   
        System.out.printf("|R.TRIANGLE|%-15S|%-10S|%4.1f|%4.1f| - |%7.2f|\n",
                owner, color, a, b,c, getArea());
    }
    
}
