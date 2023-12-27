/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class Square {

    private String owner;
    private String color;
    private double edge;

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }

    //ai có nhiều info, gã đó tính, hàm thuộc về...
    public double getArea() {
        //return edge * edge;
        return Math.pow(edge, 2); //edge^2
    } //re-use ở các chỗ khác

    public void paint() {
        System.out.printf("|SQUARE   |%-15S|%-10S|%4.1f|  - |%7.2f|\n",
                owner, color, edge, getArea());
    }

}
