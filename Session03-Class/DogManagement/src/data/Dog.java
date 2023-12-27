
package data;
//khun dùng để đúc ra các project, đối tượng cần lưu trữ iinfo,  thứ
//làm ra để bán
//khuôn phải kín, có phễu để chế/ rót/hứng/ đổ vào cái data, nguyên liệu
public class Dog {
    //chứa đặc điểm, chi tiết mà cái khuôn, object tương lai sẽ có
    //khuôn dsign ra sao, mai mốt object có thể
    private String name;
    private int yob;
    private double weight;
    //.....
    //~~~CMDD, thẻ căn cước, khác value đổ vào, template

    //Có khuôn thì phải có phễu/ miệng loe để hứng vâật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog (String iName, int iYob, Double iWeight) {
        name = iName ;
        yob = iYob;
        weight = iWeight;
    }
    //phễu còn gọi là constructtor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    //ra object vì thông qua nó vật liệu đc chảy vào trong khuôn
    //vật liệu khô ra object/ bức tượng, cmnd của ai, hồ sơ đc tạo ra
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    //CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VL VÀO, TỨC LÀ CÓ 1 OBJECT MỚI
    //PHỄU LÀ HÀM ĐB KO GIÁ TRỊ TRẢ VỀ, KO VOID LUÔN, TAO ÓI VỀ NGUYÊN
    //BỨC TƯỢNG ĐANG ĐÚC
    //tên 100% giống tên class

    //viết các hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2001
    //object thì gọi là hành động, behaviour, xử lí tính toán trên
    //biến đc đổ value từ lúc đúc ra

    //hàm gọi n lần tương đương các hành động mà object nào đó lặp đi lặp lại
    //hđ của object gọi n lần trên object đó

    public void bark() {
        //System.out.println("Googogogog.. my name is " + name);
        //System.out.println("Googogogog.. my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                            name, yob, weight);
    }
    
    //mình đi xăm mình, nhuộm tóc
    //thay đổi info ba má đã từng cho lúc ba má new/ đúc ra mình
    public void setNewWeight(double newWeight){
        weight = newWeight;
    }
    
    //vid mặc định info sẽ là giấu kín, khi mình giao tiếp mình mới bật ra
    //chia sẻ info khi đc hỏi, đó chính là method hàm hạnh động get()
    public int getYob(){
        return yob;
    }
}
//code bên ngoài giống khuông bị lủng
//ngoài đời: bạn (yob:2001), tui (yob: 2001)

//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ (SỐNG)
