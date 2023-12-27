package dogmanagement;

import data.Dog;


public class DogManagement {

    
    public static void main(String[] args) {
        //lấy khuôn Dog ra để bắt đầu đổ info
        //y chang làm thẻ căn cước: lấy thông tin, in lên thẻ
        //sau khi chờ khô, ta đc object thuộc Nhóm vừa đúc
        //đặt tên gọi tắt cho object dể dễ dang noi chuyện, tham chiếu đến
        int yob = 2001;
        Dog ChiHu = new Dog("CHI HU HU", 2021, 0.5) ;
        //casi chiPu {name: NTC; yob: 1993; hits: Anh Ơi}
        //JSON JavaScript
        //Biến/ tên tắt         object
        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        ChiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 8.9);
        ngaoDa.bark();
        
        //chuHu sủa trở lại
        System.out.println("Chi Hu HU bark again");
        ChiHu.bark();
        
        //bark(); ??? đứa nào sủa vậy???, ko biết
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM
        System.out.println("After overweight");
        ChiHu.setNewWeight(5);
        ChiHu.bark();
        
        int chYob = ChiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        
        System.out.println("ND YOB: " + ngaoDa.getYob());
        
    }
    //new xin vùng ram mới đủ chứa info cảu 1 bạn Dog đc đúc, đc đỗ data
    //có đến 2 vùng name dành cho 2 object 
    //ND ko đè name của CHIHu
}
