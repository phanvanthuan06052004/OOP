/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
//KHUÔN TỔ, SINH RA N KHUÔN KHÁC CHO NHANH
//GIÚP V, TR, CN, HBH, TG, OVAL,.. Ở CHUNG MẢNG, MỚI SORT ĐC
//cùng PB xếp GẦN NHAU
public abstract class Shape {

    protected String owner;
    protected String color;
    protected String borderColor;
    //các cạnh thì sao?
    //protected double a, b, c, redius; //....,còn nữa thì sao, có nên ko???
    //ko đc đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa tất cả các cạnh, do đó HV sẽ có cạnh, nhiều nữa là khác, bk
    //tròn, ngoài bk, thừa kế luôn cả cạnh
    //bk, cạnh là của RIÊNG TỪNG ĐỨA CON, DỊ BIỆT THÌ PHẢI Ở TỪNG ĐỨA CON

    //CHA LÀ NHÂN TỬ CHUNG CHO CÁC CON, NGOÀI ĐỜI Y CHANG
    //ĐÁM CON CÓ DI CHUYỀN TỪ BA MÁ: OWNER, COLOR, ĐƯỜNG BO
    //NHƯNG GIỮ LẠI KHÁC BIỆT: TR: BK, V: CẠNH, TG: CHIỀU CAO/ ĐÁY...
    //a e trong nhà thừa kế từ ba má nhiều thứ, tài sản riêng mỗi Con tạo dựng
    //người đó giữ
    //diện tích và chu vi là derived field đc tính từ thằng khác, ko nên xem là dđ
    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }

   

    //XÓA KO CHO, VÌ CẦN KHÁI NIỆM NÀY ĐỂ DIỄN TẢ RÕ Ý NGHĨA HH
    //ĐỂ KO ĐC VIẾT CODE, VÌ KO CÓ CỤ THỂ KÍCH THƯỚC
    //VẪN TÒN TẠI NHƯNG KO NẮM CHẠM ĐC, VẪN TỒN TẠI VỚI NGHĨA MÔ TẢ HOY, NÓI
    //VỀ NÓ HOY, NHƯNG CHƯA CỤ THỂ ĐC, NÓI NHƯNG CHƯA LÀM, KHÁI NIỆM HOY NHA
    //HÀM TRỪU TƯỢNG, VẤN ĐỀ TRỪU TƯỢNG, THỨ VÔ HÌNH MÀ VẪN HỮU HÌNH
    //ĐỂ VÀO CHO ĐỦ BỘ HOÀN THIỆN 1 THỨ GÌ DÓ, LÃNH ĐỌA TINH THẦN, KO QUYỀN LỰC
    //CỤ THỂ
    //MA, QUỶ: VÔ HÌNH, MÌNH VẪN SỢ, KHÁI NIỆM MÀ HOY, ABSTRACT
    public abstract double getArea();   //chỉ nói mà hg có code
    public abstract double getPerimeter();
    
    //việc vẽ và in ra thông tin cũng là chung chung vì mỗi hình mỗ khác
    public abstract void paint();   //thiếu S, P để in ấn
    
    
    //tao chỉ nói rằng HH có thứ này, còn mỗi đứa V, T, CN,... tự lo đi

    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOI, CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG, TRONG TỰ NHIÊN
    //                ĐỂ DỄ DÀNG NÓI VỀ CÁC OBJECT. XẢY RA CỰC NHIỀU TRONG CUỘC SỐNG
//    public double getArea() {
//        //tính thế mẹ nào??, éo có kích thước, vì dị biệt ở từng Con
//        //return 50; // ko đc default, vì vô nghĩa khi new luôn
//        //cạnh đâu để sửa lại S, công thức đau mà tính
//    }                   //ko có kích thước sao mmaf tính đc
    //ko xóa hàm này đc, vì HH thì phải có S
    //HH cần có S như là khái niệm, nói rằng thứ nào chiếm bề mặt, có số đo S
    //đại diện cho 1 nhóm/ series các đồ vật cụ thể kahcs đều có S, P
    //để đây như là ý nhĩa tinh thần, đảm bảo đủ để mô tả 1 thứ nào đó
    //HH có S, P
//    public double getPerimeter() {
//        //tính thế nào??
//    }
    //diện tích và chu vi ko đc xem là đặc tính, mà phải xem là hành vi
    //2 hàm tính S và P để ở đâu??? Con hay Cha, hay cả 2???
    //CẢ 2: VỪA DI TRUYỀN, VỪA LÀ DỊ BIỆT (@OVERIDE)
    //ĐÃ NÓI VỀ HÌNH HỌC, LÀ PHẢI NÓI S, P, CŨNG LÀ ĐẶC ĐIỂM HÌNH HỌC NÓI CHUNG
    //HÌNH CỤ THỂ V, TR, TG, HBH CHẮC CHẮN LÀ TÍNH ĐC, CŨNG LÀ ĐẶC DIỂM CẢU TỪNG HÌNH
}   //mỗi con sẽ dị biệt trong tính toán, nhưng nói chung là có S, P, thừa kế từ
//CHa

    //ABSTRACT LÀ KHÁI NIỆM, Ý TƯỞNG VỀ 1 THỨ GÌ ĐÓ
//VỚI HÌNH HỌC THÌ gét() getP() là 2 khái niệm luôn phải có, S, P là khái niệm
//cần có khi mô tả về hình học (hàm thuộc về object phù hợp)

//tivi phải nói về dò kênh, kết nối

//ĐThoai: phải nói về bắt sóng, nhận cuộc gọi,gửi sims..

//những mô tả này có thể gọi cụ thể, nhưng cũng có thể chỉ là ý tưởng, nói thoy
//chung chung thôi
//chung chung gọi là ABSTRACT
//cụ thể gọi là      CONCRETE
