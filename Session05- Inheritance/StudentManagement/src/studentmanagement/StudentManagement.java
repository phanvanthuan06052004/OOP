/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
////        Student xxx = getAStudent("se123456");
////        if(xxx != null) //ko trỏ null tức là trỏ vùng tìm thấy thì in
////            xxx.showProfile();
////        else
////            System.out.println("NOT FOUND!");
//        //sortdStudentList();
//        List<Student> result = initData();
//        System.out.println("The Student Lits");
//        for (Student x : initData()) {
//            x.showProfile();
//        }
//    }

    public static void main(String[] args) {
        List<Student> arr = initData();
        //gọi hàm search với 4 bạn sv đã có trong arr, mà thực ra do hàm initData() tạo
        Student xxx = searchAStudent(arr, "SE88888");
        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else{
            //LỠ TÌM THẤY THÌ UPDATE LẠI ĐIỂM SỐ
            xxx.showProfile();  //XXX đang trỏ vùng new TAM 8.8
            xxx.setGpa(6868);
        }
        // RA HẴN NGOÀI IF KIỂM TRA ĐIỂM CÓ 6868 CHƯA??
        System.out.println("Check student list after updating info of  SE8  Student");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    
    //------------------------------
    //TỬ TẾ HÀM SEARCH VÀ SORT, VÀ UPDATE LUÔN
    //------------------------------
    
    public static List<Student> initData(){
        //hàm trả về 1 cái tui có sẵn bên tỏng 1 nhóm sv
        //trả về tọa độ 1 cái túi, vẫn new Túi mà, trong Túi chứa thẻ bài sv
        //là chuyện khác nữa
         List<Student> arr = new ArrayList(); //đi mnua cái túi doremon
        Student chin = new Student("SE99999", "CHIN LE", 2009, 9.9);
        
        arr.add(new Student("Se444444", "BON PHAM", 2004, 4.4));
        arr.add(chin); 
        
        arr.add(new Student("SE55555", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE88888", "TAM LY", 2008, 8.8));
        return arr; //initdata() = arr; arr ơi mày đang trỏ new Bự nào
                    //cho tên hàm tao trỏ với
    }
    
    //ta search/ tìm kiếm 1 hồ sơ sv đựa theo mã số, có nhận vào ds luôn cx đc
    public static Student searchAStudent(List<Student> arr, String id){
        //arr là cái túi new đau đó r, tên biens là con  trỏ mà
        //trong túi này có 1 nhóm sv sẵn rồi , add sẵn rồi 
        if (arr.isEmpty()) //Túi ko có thẻ bài, tức là size() trả về 0
            return null;              //có sv nào đc tìm thấy đâu, trả về tọa độ đáy RAM
        //CPU chạy xuống đây, Túi có thẻ bài rồi, ds có người điền tên rồi
        //for hỏi từng thẻ 1, ê ku (i) id mày là gì??? coi bằng id càn tìm hg
        
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if (tmp.getId().equalsIgnoreCase(id))
                return tmp;   //return thẻ bài thứ i có trỏ vùng id tìm thấy
                                //thẻ bài, con trỏ có lưu tọa độ, tao return tọa độ
        }
        
        //đi hết for mà ko return đc, sure CŨNG ÉO THẤY LLUOON, NULL ĐÁY RAM
        return null; //HÀM YÊU CẦU TRẢ VỀ TỌA ĐỘ VÙNG NEW, ÉO THẤY THÌ VÙNG NULL
    }
          
    
    
    //                          có thể đưa Giỏ từ ngoài vào oki
    public static void sortdStudentList() {
        List<Student> arr = new ArrayList(); //đi mnua cái túi doremon
        Student chin = new Student("SE99999", "CHIN LE", 2009, 9.9);
        
        arr.add(new Student("Se444444", "BON PHAM", 2004, 4.4));
        arr.add(chin); 
        //arr.add(binh); //danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ
                        //
        arr.add(new Student("SE55555", "NAM VO", 2005, 5.5));
        arr.add(new Student("SE88888", "TAM LY", 2008, 8.8));
        
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                    //set() là thay đổi info của con trỏ, trỏ chỗ khác
                    //lấy thẻ bài ra khắc lại thông tin trỏ
                }
            }
        }
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    //THỬ NGHIỆM HÀM TRẢ VỀ 1 OBJECT, THỰC CHẤT LÀ TRẢ VỀ TỌA ĐỘ VÙNG 
    //NEW - XEM LẠI BÀI OBJECT INSIDE-OUT TRÊN YT
    //đưa vào mã số sv mún tìm
    //ta sẽ tìm trong giỏ/túi thẻ bài, coi có ai mà óc trùng mã số
    //thì trả về thẻ bài, hồ sơ bạn sv đó, trả về tọa độ hồ sơ sv đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList(); //đi mnua cái túi doremon
        Student binh = new Student("SE99999", "BINH LE", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));
        arr.add(binh); //mày đưua tao tọa độ vùng new

        Student tmpStudent = arr.get(0); //lấy đc tọa độ sv 0, thẻ bài 0

        //hỏi xem bạn ý id là gì
        String tmpId = tmpStudent.getId(); //arr.get(0).getId();
//        
//        if (tmpId == id) {
//            return tmpStudent;    //arr.get(0)
//        }                         //trả về tọa độ trong thẻ
//                                    //trả về thẻ bài 0
        if (tmpId.equalsIgnoreCase(id)) {
            return tmpStudent; //arr.get(0) 
            //HOÀN TOÀN KO CÓ SV MỚI XH, CHỈ THAM CBHIEEUS TỌA ĐỘ VÙNG NEW
            //RETURN GET(0) THẺ BÀI 0 , THẺ BÀI 0 TRỎ VÙNG NEW AN NGUYỄN
        }
        return null; //KO TÌM THẤY
        
    }

    //set: là 1 loại giỏ, túi, mà ko cho phép đựng trùng món 
    //tức là ko có món nào xuât shienej qua 1 lần
    //ko cho phép trỏ trung 1 vùng new 
    //ĐẾM SỐ NGƯỜI XEM PHIM, LỄ HỘI, TIỆC, ĐẾM MỖI NGƯỜI 1 LẦN
    //LIST: CỨ CÓ VÀO LÀ ĐẾM, VỀ RỒI, QUAY LẠI VẪN ĐẾM - SỐ NGƯỜI THAM GIA
    public static void playWithSet() {
        Set<Student> arr = new HashSet(); //mua cái túi Doremon
        //mở khóa để thao tác, .hàm()
        Student an = new Student("SE123456", "AN NGUYEN", 2003, 9.0);
        arr.add(an);
        arr.add(an);    //adđ trùng

        arr.add(new Student("SE99999", "BINH LE", 2003, 4.9));
        arr.add(new Student("SE99999", "BINH LE", 2003, 4.9));  //ÉO TRÙNG 
        //CÓ NEW CÓ VÙNG RAM MỚI, OBJECT MỚI, TRÙNG INFO BÊN TRONG NEW
        //ÉO PHẢI VẤN ĐỀ,
        //SET LÀ KO CHẤP NHẬN CON TRỎ TRÙNG VÙNG NEW
        //MỖI THẺ BÀI ĐC ADĐ VÀO GIỎ, KO TRỎ LẠI 1 VÙNG NEW NÀO ĐÓ

        //ko có hàm get() vì giỏ này đưa đồ vào, thẻ bài vào 
        //thẻ bài đưa vô ko giữ nguyên thứ tự như đưa vô
        //thì có 2 tình huống xảy ra: HashSet: để "lộn xộn" thẻ bài
        // để thẻ bài "có thứ tự" theo cách riêng
        //KHÁC HOÀN TOÀN THỨ TỰ KIỂU ARRAYLIST
        //ARAY LIST LÁ VÀO TRƯỚC, ADD TRƯỚC NGỒI TRƯỚC, VÀO SAU NGỒI SAU
        //GIỎ CHỨA MẤY THẺ BÀI?? ADD 3 LẦN ĐẦY. ARRAYLISST ADĐ BAO NHIÊU 
        //                                          CHỨA BẤY NHIÊU
        System.out.println("The student list");
        for (Student x : arr) { //duyệt qua từng con trỏ, lấy tọa độ 
            //từng thẻ bài gán vào con trỏ x
            x.showProfile();
        }
        
    }

    //ta tự sort danh sách sinh viên làm bừng tay
    //còn 1 cơ chế ta ko cần dùng vòng forr tự viết
    //hàm static: Collections.Sort() //dùng INTERFACE mới đc - giảng sau
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList(); //đi mnua cái túi doremon
        Student binh = new Student("SE99999", "BINH LE", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYEN", 2003, 9.0));
        arr.add(binh); //mày đưua tao tọa độ vùng new
        arr.add(binh);  //add trùng vùng new vô tư 
        //có 2 tọa độ trong túi, 2 thẻ bài trong túi
        //get() từng thẻ bài thhif đc tọa đọ vùng new
        //[i] đc tọa độ vùng new, y chang mảng, mỗi ptu mảng là 1 tọa độ
        System.out.println("The student list");
        //mảng đang giảm dần về điểm, tui giảm dần về điểm
        //thẻ bài 1 trỏ vùng điểm cao, thẻ bài 2 trỏ vùng điểm thấp
        for (Student x : arr) { //tirng arr là 1 đóng con trỏ
            x.showProfile();
        }
        System.out.println("The student list (print using for i)");
        for (int i = 0; i < arr.size(); i++) {
            Student x = arr.get(i); //lấy tọa độ đang nằm trỏ thứ i
            x.showProfile();
        } //NHỚ CÂU: CÓ TỌA ĐỘ CHẤM LUÔN

        //MẢNG CHƠI [I] SỜ NGAY CON TRỎ THỨ I 
        //túi phải mở ngay ra, để lấy, goi hàm .hàm()
        //đỏi đc 2 thằng thì đổi đc cả giỏ, 2 vòng for
        Student tmp = arr.get(0); //tmp trỏ cùng AN 9.0
        arr.set(0, arr.get(1)); // con trỏ thứ 0 trong giuor, thẻ bài thứ 0 
        //phải trỏ thằng BÌNH 4.9
        arr.set(1, tmp);
        //con trỏ 1 thay cách trỏ, trỏ vào vùng tmp đang trỏ
        //                          tmp đang trỏ AN 9.0
        //vùng new Student() vẫn nằm im, chỉ có thẻ bài trong giỏ
        //trỏ lại vùng new

        System.out.println("The Student list after sorting");
        for (Student x : arr) { //trong arr là 1 đóng con trỏ
            x.showProfile();
        }
        
        arr.remove(1);  //AN  
        System.out.println("The student list after removing a Student");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
    public static void playWithArrayList() {
        //Student[] arr =new Student[500];
        //arr là 11 caisi túi sẵn 500 chõ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chinhsn là má mì, quản lí nhiều đồ, tên túi lun

        //List arr = new ArrayList(); //đựng lộn xộn ddue loại con trỏ
        //đúng nghĩa túi doremon, món gì cũng đựng, đựng tham chiếu hoy nha
        //nhét đc NhanVien, GiangVien, Animal, Dog,...
        //túi đồng nhất chỏ lưu con trỏ sinh viên
        List<Student> arr = new ArrayList();//túi đựng đồng nhất 11 lọa GENNERRATE

        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét dồng nhất món đồ dễ chấm chung đc, đa hình đc
        //MỞ NGĂN TUUR, TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student(...); //mảng
        //arr.add(new Student(...)) //lưu con trỏ hoy, new Student () thoải mái
        //ben ngoài, vùng HEAP
        Student s1 = new Student("SE123456", "AN NGUYEN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BINH LE", 2003, 9.0);
        arr.add(s1); //giỏ vủng new ArrayList, tủ có thêm 11 con trỏ, sinh ra 11 con trỏ
        //2 chàng 1 nàng
        arr.add(s2);    //sinh ra thêm con trỏ nữa [1]
        //add() vô tận, mảng [length - 1] hết mức
        //new cứ nằm ở HEAP, SV cứ ở nhà, CN cứ ở xưởng may, BN cứ ở phòng bênhjj
        //adđ() mở khóa kéo, kháo dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ
        arr.add(s1); //adđ trùng nnef 1 tên người vào dnah sách
        //Set ko báo lỗi, chỉ lấy 1..đừng đi vào cho tiết vội vã!!!

        arr.add(new Student("SE999999", "CHIN PHAM", 2003, 9));
        //          new cứ lên HEAP mà nằm, bệnh nhân cứ vê phòng, tớ nắm thẻ bài
        //1 con trỏ nữa lại đc add vào

        //hỏi xem túi đang có bao nhiêu đồ
        //arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " mon do");
        //4 sinh viên in ra, nhưng thực ra chỉ có 3 sv, do có người đếm trùng

        //in mọi người ra
        //tủ có gì, chuuwas bên trong 1 dống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ1, con-tro2, con-tro3, con-tro4,....nếu add() thêm
        //add() đẩy vcaof 1 con trỏ, tọa độ, thẻ bài
        //get(vị trí thẻ bài muốn lấy), trả về tạo độ con trỏ thứ i 
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy đc tham chiếu bạn thứ i
        //get(i) lấy đc chỗ ngồi tham chiếu con trỏ thẻ bài thứ i 
        //a, thẻ này trỏ bạn sv kia kìa
        //in bạn dầu tiên
        //arrr[i].showProfile() phần tử đầu tiên cảu mảng
        Student x = arr.get(0); //trả về tọa độ con trỏ thr bài bạn thứ ko
        //trả về tọa đồ gán vào biến Student khác nắm cùng tọa  độ ok
        System.out.println("The Stuudent list");
        x.showProfile();

        //bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ
        //cùng làm gì??
        arr.get(1).showProfile(); //á đù trả về con trỏ, học rồi 7 viên ngọc rồng

        System.out.println("In xin xo");
        for (Student z : arr) { //éo sợ NULL POINTER adđ() đến dâu thêm con trỏ đến đó
            //x = arr.get(i) = arr[i]
            z.showProfile();
        }
        System.out.println("In xin so for truyen thong");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

        //có hành động xóa 1 con trỏ, loại bỏ 11 thẻ bài, món đồ, gạch tên
        //1 người khỏi dnah sách
        //vùng new Student() bị mất ko tùy vào mấy con trỏ trỏ nó, học rồi
        //size() giảm liền, mảng éo cso, fix cuuwngs số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác (get() hàm set() xưa nay của 
        //các object)
    }
}
