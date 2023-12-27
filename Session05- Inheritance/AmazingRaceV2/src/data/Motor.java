/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author ACER
 */
//chơi thêm kế thừa, motor is a kind of vihicle (abstract class)

//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG TRÊN ĐƯỜNG THẰNG VỚ VẪN NÀO ĐÓ NẸT BÔ, MINH FKEOS TAY GA MẠNH HƠN
//BỐC ĐẦU, VỌT XE, TỐC ĐỌ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOAUF VIỆC MOTOR 
//THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
//GIA NHẬP HỘI ĐUA THOY, CHỈ ĐUA HOY
//TỚ CÒN LÀ 1 ĐUA THỦ, KO DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA 
//                                                  IMPLEMENT
//                                                TỚ THAM GIA CLB, TRUỂN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENT ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KO CHỊU ĐUA SAO ĐC
//@OVERRIDE
//CLASS CHÍNH CỦA CHÚNG TA CỨ CÓ ĐẶC ĐIỂM HVI NHƯ BT
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HĐ CỦA CLB ĐÓ, @OVERRIDE HĐ ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỌNG ỨNG VỚI TỪNG CLB TA THAM GIA, HỢP LÍ NGOÀI ĐỜI
//ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIẤY
//VỀ LOGI, TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ 1 DINGF HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA, ĐƯƠN KẾ THỪA
//            1 CON THAM GIA N CLB, VẬY SẼ CÓ HĐ CỦA N CLB

//C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!

public class Motor implements DeathRacer{
    private static final double MAX_SPEED = 180;
    
    private String model; //exciter 2021, WIner 2020
    private String volume; //số phân khối 125.0cm3
    private String vin; //biển số, số khung, vehicle Identifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    //HÀNH VI XE MÁY LÀ CHẠY, có tốc đc ghi nhận
    
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
                    //chạy ngẫu nhiên và sko quá 180 km
    }
    
    //quay video và gáy tốc độ
    public void showRecord(){
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1s|\n",
                                "MOTOR",model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        //CHẠY TỐC ĐỘ CAO, đôn nòng, xoáy nồng, ép dên, dồn dên
        return run() * 3; //run() giả sử đc 150 x 3 đua đến chết còn gì??
    }

    @Override
    public void showHowToDead() {
      System.out.printf("|%-20s|%-15s|%-8s|%11s|%5.1s|\n",
                                "MOTOR-RACER",model, volume, vin, runToDead());
    }
}
