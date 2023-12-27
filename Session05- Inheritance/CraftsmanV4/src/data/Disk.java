
package data;


public class Disk extends Shape{
    
    public static final double PI = 3.14;
    
    private String smile;  ///dị biệt cho con
    private double radius;
    //owner, color, border lấy từ Cha, Cha giữ giùm, những điểm chung cho anh em

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "smile=" + smile + ", radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return Disk.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|DISK      |%-10s|%-10s|%-10s|%4s|%4.1s|%4s|%7.2f|\n", 
                owner, color, borderColor, smile, radius," ", getArea());
    }
    
    
}
