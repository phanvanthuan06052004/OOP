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
//Dog ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi hoang
//đi đua thì nó phải chạy vượt tốc độ bình thường, runToDoad() như mọi đua thủ
//Mình vẫn là COn cháu dòng họ Lê, Phạm, học như bt SV,
//nhưng còn tham gia CLB đua thủ, phượt, CLB gì đó, thì phải có hđ của CLB 
//IMPLEMENT ALL ABSTRACT METHODS, NỘI QUY CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
      System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                              "DOG", name, yob, weight, run());
    }

    //PHẦN HOANG DÃ TRONG TA, BỘC LỘ KHI ĐI ĐUA
    //TỤI MÀY, SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH!!
    //VÀO SG, CHẮC CHẮN THÊM PHẦN BỘ LỘ KHÁC: NHẬU NHẸT, GAME, CÁ ĐỘ, ĐÁNH BẠT,
    //                                          CLB TA, PHƯỢT, TỪ THIỆN, CẦU LÔNG                                    
    @Override
    public double runToDead() {
        return run() * 5;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                              "DOG-RACER", name, yob, weight, runToDead());
    }
    
    
}
