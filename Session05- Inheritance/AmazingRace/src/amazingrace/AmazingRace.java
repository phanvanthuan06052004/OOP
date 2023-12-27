/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author ACER
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //register();
        showRecordsWithTakeAway();
    }

    public static void showRecordsWithTakeAway() {

        //đường đua đông vui, có nhiều racer, và có một con gì đó ko nhìn rõ
        //bay theo, vật gì đó bay theo, tức là có tốc độ
        //mình ko biết, ko xác định đc nhóm của nó là gì, chưa biết class gì
        //vì mày muốn nhập đội, oki, chạy theo đi, chơi trò take-away
        //mượn gió bẻ măng, mượn pet để new object
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f||\n", "XXXXX", name, yob, weight, run());
            }
        };

        Hamster xx = new Hamster("NHAT", 2021, 0.3);
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VANG OI", 1950, 10.0),
            new Cat("TOM", 1960, 15.0),
            new Cat("KITTY", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5),
            xx, ufo //object tạo từ ANO vẫn là pet vào
        //mảng
        };
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }

        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    //tốc độ chạy sẽ bị thay đổi cho mỗi lần so sánh
                }   //S, P, GPA cố định, thoải mái gọi gét() getGPA() để
            }       //so sánh và đổi chổ
        }
    }
}

//    public static void register() {
//        Cat tom = new Cat("TOM", 1950, 10.5, "><");
//        tom.showRecord();
//        
//        
//        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
//        kitty.showRecord();
//        
//        Dog ngaoDa = new Dog("NGAO DA", 2021, 50.0);
//        Pet beTo = new Dog("BE-TO", 2012, 5.0);
//        ngaoDa.showRecord();
//        beTo.showRecord();
//        
//        //run() đa hình ròi các con ơi
//        //if([i].run() > [j].run() ) KHÓ VÌ MÓA, MỖI LẦN GỌI RUN() THẰNG I J
//        //LÀ KHÁC NHAU
//        //BÀI KIA LÀ DIỆN TÍCH ĐIỂM TB CỐ ĐỊNH LÚC SPORT, 2 FOR KO ĐỔI S, ĐIỂM 
//        //BÀI NÀY CỨ GỌI TOM. RUN() TÊN CỐ ĐỊNH, NĂM SINH CỐ ĐỊNH
//        //RUN() ÉO CỐ ĐỊNH
//    } 
//}
