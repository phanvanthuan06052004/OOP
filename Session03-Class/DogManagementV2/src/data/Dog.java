
package data;
//khun dùng để đúc ra các project, đối tượng cần lưu trữ iinfo,  thứ
//làm ra để bán
//khuôn phải kín, có phễu để chế/ rót/hứng/ đổ vào cái data, nguyên liệu
public class Dog {
    //chứa đặc điểm, chi tiết mà cái khuôn, object tương lai sẽ có
    //khuôn dsign ra sao, mai mốt object có thể
    private String name;
    private int yob;
    private double weight;
    //.....
    //~~~CMDD, thẻ căn cước, khác value đổ vào, template

    //Có khuôn thì phải có phễu/ miệng loe để hứng vâật liệu đi vào
    //phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //ta chủ động đưa nhiều info của ta
    public void bark() {
        //System.out.println("Googogogog.. my name is " + name);
        //System.out.println("Googogogog.. my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                            name, yob, weight);
    }
    //một object bất kì có nhiều info mô tả, vi dụ: xem đtdt trên tgdđ, đập hộp có sách 
    //ghi thông số lun. Nhìn 1 cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã số...
    //gặp chú CSGT, show ra các info mình có: CCCD, Driver lic, Cà-vẹt...
    //việc show onfo của 1 object là tự nhiên, FB profile
    //đó là 1 hành động nên có của mỗi object, mô tả, dặc tả về object
    //hành động này có thể do ta chủ động tự đưa ra, hoặc tự generate theo template có sẵn
    //template có sẵn java giúp mình, mình ko cần code

    @Override   //khác overload đó nhen, dính đến kế thừa
    //cả 2 thằng đều có liên quan đến 1 kahis niệm là POLYMORPHÍM - 50 sắc thái
    public String toString() {
        // return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại độc quyền, vì chỉ cần trả chuỗi chưa info của mình
        // y chang mình làm card visit
//        String tmpMps = String.format("|%-10s|%4d|%4.1f|\n",
//                                            name, yob, weight); //trả chuỗ thô, ko xuốn hàng
//        return tmpMps;
        
        return  String.format("|%-10s|%4d|%4.1f|\n",
                                            name, yob, weight); 
    }
    
    //hàm gắn vieecjxuwr lí info của chính object. Ai giàu info, gã đó nên xử lí
    public int getAge(){
        return 2021 - yob;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau phải sửa code thì tuổi mới đúng
    //chuẩn: lấy giờ hệ thống Window - yob
    
}

