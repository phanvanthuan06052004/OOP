/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Rectangle {
    private String owner;///_____
    private String color;//______
    private double width;
    private double length;
    //private double area;//đặc tính/đặc điểm đc tính từ các đặc tính khác
                        //khác, từ w * 1 -> đặc tính dẫn xuất - derived field
                        //tt = s1 * dg
    //dẫn xuất tức là đc tính từ kẻ khác, tính tức là xử lí, hammf xuất hiện
    //hàm thuộc về kẻ có nhiều info
    //ví dụ khác: lưu tuổi, lưu cả năm sinh -> mỗi năm tuổi lên 1 nhát....

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    //ai có nhiều info, gã đó tính, hàm thuộc về...
    public double getArea(){
        return width * length;
    } //re-use ở các chỗ khác
    
    public void paint(){   // 10 x 10 = 100.00   50 x 50  = 2500.00
        System.out.printf("|RECTANGLE|%-15S|%-10S|%4.1f|%4.1f|%7.2f|\n",
                owner, color, width, length, getArea());
    }
}
