/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicarray;

import java.awt.BorderLayout;

/**
 *
 * @author ACER
 */
public class Sorting {

    //thêm 1 main() ngoài main() ban đầu, main() phải mở lên shift - F6
    //F6 đứng ở classs nào cx đc, ưu tiên default chạy main() đầu tiên tạo ra
    //có thể đổi main() default đc nếu mún
    //phải chuột properties/run/...
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }

    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE19", "CHIN", 19, 9),
                                        new Student("SE5", "NAM", 15, 5),
                                        new Student("SE7", "BAY", 17, 7),
                                        new Student("SE3", "BA", 13, 3),
                                        new Student("SE8", "TAM", 18, 8)
                                         };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i].getGpa() > arr[j].getGpa()) {
                     Student tmp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = tmp;
                 }
            }
        }
        System.out.println("The student list After sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
}
    
    public static void sortPrimitiveArray() {
        int[] arr = new int[]{1000, -1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //if thằng đầu mà lớn hơn thằng sau, đổi ngay và luôn
                if (arr[0] > arr[1]) {//[i] trước [j]
                    int t = arr[0]; //mày trước tao, mà lại lớn hơn t
                    arr[0] = arr[1];    //đổi
                    arr[1] = t;         
                }   // > tăng dần, < giảm dần
            }
        }
        System.out.println("After sorting ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
