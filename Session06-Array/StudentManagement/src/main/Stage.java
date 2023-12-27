/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import data.Shelf;
import java.util.Scanner;
//import data.Student;
//import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE MAJOR",0);
        do {
            printMenu();
            System.out.println("Input your choice (1..6)"); //myToys
            choice = Integer.parseInt(sc.nextLine());
            //if các choice thì làm gì tương ứng
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1....6 options");
                    break;
            }
        } while (choice != 6); //còn đúng thì còn lập
        //chưa chọn 6, chưa muốn kết thúc, lặp lại cuộc chơi
    }

    public static void printMenu() {
        System.out.println("Wellcome to UTE - UTE Academic Portal");
        System.out.println("Choose the flolwing functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a sudent profile");
        System.out.println("6. Quit");
    }

    
    public static void testShelf() {
        
        //NGON MENU VÒNG LẶP CHỌN 1 THÊM 2 HỒ SƠ, 2 IN DÁNH SÁCH
        //Shelf tuSE = new Shelf("PINK", "SE");
        Shelf tuSE = new Shelf("PINK", "SE", 0);
        tuSE.addAStudent();
        tuSE.addAStudent();
        Shelf tuGD = new Shelf("RAINBOW", "GD", 0);
        tuGD.addAStudent();
        //tuSE.inputAStudent();
        //tuSE.inputAStudent();

        System.out.println("The student list for all");
        tuSE.printStudentList();
        tuGD.printStudentList();
        //tuSE.printStudentList();
        //inputStudentList();
    }

//    public static void inputStudentList() {
//        Scanner sc = new Scanner(System.in);
//        String id, name;
//        int yob, count;
//        double gpa;
//        
//        System.out.println("How many student do you want to input? ");
//        count = Integer.parseInt(sc.nextLine()); //MyToys.getAnInterGer(?????);
//        
//        Student[] arr = new Student[count];//5 hồ sơ
//        
//        //for nhập 5 hồ sơ
//        for (int i = 0; i < count; i++) {
//            System.out.println("Input student #" + (i + 1) + "/" + count);
//            System.out.println("Input id: ");
//            id = sc.nextLine();
//            
//            System.out.println("Input name: ");
//            name = sc.nextLine();
//            
//            System.out.println("Input yob: ");
//            yob = Integer.parseInt(sc.nextLine());
//            
//            System.out.println("Input gpa: ");
//            gpa = Double.parseDouble(sc.nextLine());
//            
//            arr[i] = new Student(id, name, yob, gpa);
//        }
//        System.out.println("The student list");
//        for (Student x : arr) {
//            x.showProfile();
//        }
//        //sort dăm ba cái đồ yêu, éo thèm làm, vì đã học
//    }
}
