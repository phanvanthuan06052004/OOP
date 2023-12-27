/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementv2;

import data.Cabinet;

/**
 *
 * @author ACER
 */
public class StudentManagementV2 {

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addStudent();
        se.addStudent();
        
        se.updateAStudent();
        System.out.println("The student list after updating");
        se.prinStudentList();
        //search ko thấy
//        se.searchAStudent();
//        //search thấy
//        se.searchAStudent();
                
    }
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        
//        System.out.println("INPUT SE STUDENT (S)");
//        se.addStudent();    //#1
//        
//        System.out.println("INPUT IA STUDENT (S)");
//        ia.addStudent();//#1
//        ia.addStudent();//#2
//        
//        System.out.println("SE MAJOR");
//        se.prinStudentList(); //1 bạn
//        
//        System.out.println("IA MAJOR");
//        ia.prinStudentList();   //2 bạn
//        
//    }
    
}
