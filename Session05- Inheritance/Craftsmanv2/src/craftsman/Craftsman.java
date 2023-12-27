/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

/**
 *
 * @author ACER
 */
public class Craftsman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cutShapes();
        //sortShapes();
        playWithChildClass();
    }
    public static void playWithChildClass(){
        Square s1 = new Square("TIA", "PINK", 5);
        s1.paint(); //ko núp bóng Ba, mún có bản sắc, tui là HV, (dĩ nhiên HCN)
                                            //SQUARE KÌA, mày thể hiện
                                            //chớ ko phải là ba
    }

    //vi diệu 1:
    
    
    
    
    //vi diệu 2:
    
    
    
    
    
//    public static void sortShapes() {
//        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
//
//        Rectangle rectArr[] = new Rectangle[3];
//        //có 9 biến rectangle, chưa hình cụ thể nào
//        //lớp có 30 chỗ ngồi, chưa có bạn nào đến
//        //rectArr[i] = new rec(...); //[i] cần trỏ vùng new Rectangle ()
//        //                                      new cũ, mới, éo quan tâm
//        //                                      chỉ quan tâm vùng clone new Rect
//        rectArr[0] = r1; //2 chàng 1 nàng clone TÍA
////        rectArr[0].paint();
////        rectArr[0].setOwner("YEU TIA");
////        r1.paint(); //YÊU TÍA
//        rectArr[1] = new Rectangle("MA", "PINK", 3.0, 4.0);
//        rectArr[2] = new Rectangle("A HAI", "BLUE", 3.0, 3.0);
//
//        rectArr[3] = new Square("G.A.HAI", "BLUE", 1.0,1); 
//        
//        //KO cuungf kiểu, ko cùng hệ, ko cùng data type, éo chung mảng, ko sort đc
//        // LÍ THUYẾT: MÚN LÀM ĐC CHO V, CN, 2 THẰNG NAWYF CÙNG MẢNG CỦA 1 THỨ
//        //NÀO ĐÓ, PHẢI LÀ 1 CÁI MẢNG GÌ ĐÓ??
//        //SORT TRÊN CÁI GÌ ĐÓ
//        //NAY: 2 KHUÔN ĐỘC LẬP, 2 MẢNG ĐỘC LẬP
//        
//        System.out.println("The list of rectangle");
////        for (Rectangle x : rectArr) {
////            x.paint();  //x = arr[i];
////        }//coi chừng toang vì NULL POINTER EXCEPTION
//        //chỉ for đến chỗ đã trỏ/ gán của mảng. count trong bài cái tủ đó
//        System.out.println("Before sorting");
//        for (int i = 0; i < 3; i++) {
//            rectArr[i].paint();
//        }
//
//        //sort tăn dần S, y chang sort tăng dần theo GPA
//        for (int i = 0; i < 3 - 1; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                if (rectArr[i].getArea() > rectArr[j].getArea()) {
//                    Rectangle t = rectArr[i];
//                    rectArr[i] = rectArr[j];
//                    rectArr[j] = t;
//                }
//            }
//        }
//        //POLYMORPHISM/OVERRIDE
//        
//        System.out.println("After sorting ascending by area");
//        for (int i = 0; i < 3; i++) {
//            rectArr[i].paint();
//        }
//    }

//    public static void cutShapes() {
//        Rectangle r1 = new Rectangle("TIA", "PINK", 1.0, 2.0);
//        r1.paint();
//
//        Square s1 = new Square("MA", "PINK", 3);
//        s1.paint();
//
//        Disk d1 = new Disk("BE NA", "RAINBOW", "<3", 2.0);
//        d1.paint();
//    }
}
