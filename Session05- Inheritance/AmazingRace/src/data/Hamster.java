/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import static data.Dog.MAX_SPEED;
import java.util.Random;

/**
 *
 * @author ACER
 */
public class Hamster extends Pet {

    public static final double MAX_SPEED = 60;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                "HAMSTER", name, yob, weight, run());
    }

}
