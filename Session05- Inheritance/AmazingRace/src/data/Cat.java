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
public class Cat extends Pet {

    public static final double MAX_SPEED = 50;

    //public String ribbon;   //ruy băng

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight); //Mèo chính là 1 pet
       // this.ribbon = ribbon;       //đưa con bay thật xa
    }

//    public String getRibbon() {
//        return ribbon;
//    }

//    public void setRibbon(String ribbon) {
//        this.ribbon = ribbon;
//    }

    @Override
    public double run() {
        //trong cuộc sống có những "thứ-object" sinh ra cho mình mấy cái trò
        //ngẫu nhiên, như vậy chúng thuộc Nhóm/ Khuon Ngẫu Nhiên, class Ngẫu Nhiên
        //JDK có sẵn cái khuôn này rooif, tên là Random
        //                                                     ----Scanner---Math
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED; //trả cho mình con số 
        //trong khoảng (0..1)  * 50 = GẦN 50
        return speed; //trả về tốc độ gần 50, hên xui random

    }

    @Override
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4.1f|\n", 
                               name, yob, weight, run());
    }

}
