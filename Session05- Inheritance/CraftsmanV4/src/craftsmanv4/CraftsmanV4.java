/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craftsmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class CraftsmanV4 {

    public static void main(String[] args) {
        //sortShapes();
        //playWithShape();
        sortShapesWithAnonymouus();
    }

    public static void sortShapesWithAnonymouus() {
        
        //Annonymous here!!!
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //CẮT hình ngẫu nhiên, ko gọi đc  là hình gì, S phải tự đo
                return 50;
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n", 
                                  "TAKE-AWAY", owner, color, borderColor," "," ", getArea());
            }
        };
        
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MA", "PINK", "MAGENTA", 6);
        Rectangle s2 = new Square("MA", "PINK", "MAGENTA", 7);
        Shape s3 = new Square("MA", "PINK", "MAGENTA", 8);
        //Hà KIều Anh nhận là công chúa!!!

        Disk d1 = new Disk("BE NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BE NA", "RAINBOW", "BORDEAUX", "<3", 6);

        Triangle t1 = new Triangle("GHE BE NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHE BE NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

                           
        Shape arr[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2, onTheGo};
                                                                        //hình ngẫu nhiên vẫn là Hình
        System.out.println("The list of Shape");
        for (Shape x : arr) {
            x.paint();
        }
        //sắp xếp hoy....
        for (int i = 0; i < 10 -1; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println("The list of Shape sorting ascending by area");
        for (Shape x : arr) {
            x.paint();
        }
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MA", "PINK", "MAGENTA", 6);
        Rectangle s2 = new Square("MA", "PINK", "MAGENTA", 7);
        Shape s3 = new Square("MA", "PINK", "MAGENTA", 8);
        //Hà KIều Anh nhận là công chúa!!!

        Disk d1 = new Disk("BE NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BE NA", "RAINBOW", "BORDEAUX", "<3", 6);

        Triangle t1 = new Triangle("GHE BE NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHE BE NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

        //ta có thể khai báo 9 hình này đều là SHAPE, cực ĐẸP KHI NHÌN ĐỘI HÌNH
        //ĐỒNG NHẤT
        //IN KẾT QUẢ TRƯỚC KHI SORT DIỆN TÍCH
        r1.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CON, CON
        r2.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CHA, CON
        s1.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CON,CON
        s2.paint();   //HÀM CỦA AI ??? CHẠY THẾ NÀO >CHA, CON QUA MẶT
        s3.paint();    //HÀM CỦA AI ??? CHẠY THẾ NÀO > ÔNG NỘI, CHÁU QUA MẶT
        d1.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CON, CON 
        d2.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CHA, CON QUA MẶT
        t1.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CON, CON 
        t2.paint();  //HÀM CỦA AI ??? CHẠY THẾ NÀO > CHA, CON QUA MẶT

        //PAINT() Ỏ ĐÂY HAY CỰC:
        //CHỈ CÓ 1 HÀM TÊN LÀ PAINT() NHƯNG CÓ ĐA DẠNG CACH VIẾT CODE
        //LÚC CHẠY ĐA DẠNG LUÔN, LÚC CHẠY TRÒN, CHỨ NHẬT, V, TG,...
        //cùng hàm Cha, Ông nội tùy cách khai báo, nhưng Đam con biết
        //Override đúng lúc
        //từ 1 hàm paint() anh xạ/ chiếu ra N cách viết code/implement khác nhau
        //thực thi (chạy) theo N cách khác nhau 
        //từ 1 biến hóa ra nhiều, từ 1 có đa hình dạng, đa ánh xạ cách làm cách chạy
        //từ 1 biến hình transformer, đa nhân cách 50 sắc thái, từ 1 ra nhiều
        //KĨ THUẬT VIẾT CODE TỪ 1 HÀM MÀ CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
        //KĨ THUẬT NÀY GỌI LÀ TÍNH ĐA XẠ, ĐA HÌNH POLYMORPHISM
        //HAY HƠN NỮA NÀY, CHÚNG MÀY VÀO MẢNG GIÙM TAO ĐỂ TAO FOR, TAO SORT 
        //MẢNG SHAPE AGAIN 
        //Shape[] box = new Shape[9]; //9 biến Shape
        //box[0] box[1] .. là các biến shape cần trỏ vùng new gì đó
        //                                      new Rectangle() new Disk() new Square()
//        box[0] = r1; //hai chàng 1 nàng
//        box[1] = r2;
//        box[2] = d1;

//        Shape box[] = new Shape[] {new Disk(), new Rectangle(), new Triangle()}
        //                             box[0]     box[1]
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of Shape");
        for (Shape x : box) {
            //x = box[0], x = box[1], x = box[i]
            //x cùng trỏ vùng new mà box[i] đang trỏ, new Rect() new Disk()...
            x.paint();
            //ĐA HÌNH SIÊU ĐẸP, 1 HÀM PAINT() CHA N CÁCH CHẠY
            //1 RA NHIỀU CÁCH THỰC THI, ĐA HÌNH ĐA XẠ POLYMOROHISM
            //CHA CHỈ NÓI PAINT() ANH EM NHÀO VÔ
            
            //SORT ĐC KO????
            if(box[i].getArea() > box[j].getArea())
                //có sợ ko láy đc S hay ko?? ÉO SỢ
                //ĐA HÌNH, GỌI HÀM CHA, NHƯNG CON CHẠY
                //MÓA, HÀM S(), P() ĐA HÌNH, CHA GỌI CON QUA MẶT
        }
        //sắp xếp hoy....
    }

    public static void playWithShape() {
        Rectangle r1 = new Rectangle("TIA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MAGENTA", "PINK", 6, 5);
        ((Rectangle) r2).getA();

        Disk d1 = new Disk("MA", "PINK", "MAGENTA", "<3", 6);
        Shape d2 = new Disk("MA", "MAGENTA", "PINK", " :X", 6);

        r1.paint(); //Con, RECTANGLE
        r2.paint();  //Cha, khi chạy qua mặt Cha, RECTANGLE, CHA éo có code kìa
        d1.paint(); //Con, DISK
        d2.paint(); //Cha, qua mặt Cha, ko care Cha nói chung, ưu tiên Con
        //code Cha ko có ko ảnh hưởng

        //NEW CHA THÌ SAO THƯA THẦY, BÀN VỤ NÀY SAU, KHÓ!!!!
        //DO CODE KO HOÀN HẢO, KO ĐẦY ĐỦ
        ///.PAINT() CHÍNH LÀ POLYMORPHISM, ĐA SẠ ĐA HÌNH ĐÃ XUẤT HIỆN                       
    }
}
