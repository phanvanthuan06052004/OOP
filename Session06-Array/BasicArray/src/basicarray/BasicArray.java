/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarray;

/**
 *
 * @author ACER
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithPrimitiArray();
        //playWithPrimitiveArrayV2();
        //playWithPrimitiveArrayV3();
        //playWithStudentObject();
        //playWithStudentArray();
        //playWithObjectArray();
        sortObjectArray();
    }
    
    public static void sortObjectArrayV3() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYEN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BINH LE", 2000, 5.0);

        System.out.println("Before  sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        //SẮP XẾP MẢNG OBJECT - mảng của các biến ibject mà trỏ vào object
        //chẳng qua là đổi vị trí trỏ, thay dổi value/ tọa độ vùng object
        //đổi cách trỏ của từng biến mảng. Chơi biến trung gian
        //khi nào thì đổi, nhắm mắt đổi là sai
        //GIẢ BỘ SẮP TĂNG DẦN CỦA ĐIỂM TRUNG BÌNH
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để in
        //nếu điểm của ass[0] đang trỏ > điểm của arr[1] đang trỏ thì mới đổi
        
        //CHỐT HẠ: CẤM TUYỆT ĐỐI XÀI > >= < <= == != CHO VIỆC SO SÁNH 2 BIẾN
        //OBJECT, VÌ TOÁN TỬ SO SÁNH TRUYỀN THỐNG CHỈ DÀNH CHO PRIMITIVE
        //int a = 5, b = 10;  if (a>b) vì 2 giá trị , so sánh đc
        //arr[0] [1] bản chất tỏng ram nó là tọa độ, là con số , luôn la hàm ý
        //địa chỉ vùng ram,
        //ĐI SO SÁNH 2 BIẾN OBJECT arr[0] [1] tương đương so sánh tọa độ, số nhà
        //nhà tao số nhà 500 đg QT, GV
        //nhà mày số nhà 2   LL, Q1
        //số nhà toa to hơn 250 lần số nhà mầy, vô nghĩa vãi
        //hãy so sánh giùm tui 2 sv An và Bình
        //sv1               sv2: vô nghĩa vì lúc thắng lúc thua theo
        //data bên trong
        
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student tmp;
            tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public static void sortObjectArrayV2() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYEN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BINH LE", 2000, 5.0);

        System.out.println("Before  sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        //TUYỆT ĐỐI KO DÙNG TOÁN TỬ > < = CHO CÁC BIẾN OBJECT, VÌ ĐI SO SÁNH 
        //TỌA ĐỘ, ĐỊA CHỈ LÀ VÔ NGHĨA
        //CHẤM BÊN TRONG ĐỊA CHỈ, CHẤM BÊN TRONG TỌA ĐỘ, VÀO TRONG OBJECT
        //VÀO TRONG VALUE PHƯC TẠP, LẤY VALUE KHÁC RA MÀ XEM, MÀ SO SÁNH
        //sv1 so sánh sv2 vớ vẫn, s1. điểm so sánh sv. điểm còn có lí
        //swap thooy, swap điểm ăn đòn, swap trỏ
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student tmp;
            tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }

    }

    public static void sortPrimitiveArray() {
        int a = 9;
        int b = 5;
        //in a trước, b sau, giảm dần value 9 5
        // tui mún tăng dần về value         5 9 
        System.out.println("a: " + a + " | b: " + b);
        //backup a 9 trước khi a chơi nhỏ 5

        //chỉ đổi, sắp xếp khi bị lộn xọn thứ tự, khi a > b lôn xộn tăng dần
        //NẾU ĐỨNG TRƯỚC MÀ LỚN HƠN VỀ VALUE, RÕ RÀNG PHẢI ĐỔI  VALUE
        //if (a>b) thì mới swap 
        if (a > b) {
            int tmp = a; //tớ temporary, temp, tmp, t 9 heng
            a = b; //tao cần value nhỏ, vì tao ngồi đầu tiên, nên mang nhỏ, mày nhỏ
            //cho tao đi
            b = tmp;    //vẫn còn 9 backup
        }
        System.out.println("a: " + a + " | b: " + b);
    }

    public static void sortObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYEN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BINH LE", 2000, 5.0);
        //[0] dduwwngf trỏ điểm to, sẽ bị in trước, in trước thì ko giảm dần;
        //[0] nên trỏ điểm nhỏ thì hay hơn
        Student tmp;
        tmp = arr[0]; //cho tớ tmp trỏ điểm 9 với heng
        arr[0] = arr[1];    //đầu bảng xin trỏ 5 thay vì 9  
        arr[1] = tmp; //chỗ ngồi kế ddaaauf bảng xin trỏ lại 9 ngày xưa của anh [0]
        //arr[0] = arr[1]; //int a = 5; int b = a; // cho tao b xin value của thằng a 

        //NEW BÌNH ĐANG ĐC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
    }   //phần tử đầu của mảng thay vì trỏ vùng new 9, nay nó trỏ new 5
    //SẮP XẾP MẢNG ONJECT, VÙNG NEW GIỮ NGUYÊN
    //ĐÔI CÁCH TRỎ [I] TRONG MẢNG
    //[thằng đầu mảng] trỏ vùng new nhỏ 5.0
    //[thằng kế mảng] trỏ vùng new to 9.0

    public static void playWithObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYEN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BINH LE", 2000, 5.0);
        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0]; x = arr[1]; //2 chàng x và arr[0] cùng trỏ new AN
            x.showProfile();
        }                              // x     arr[1]                         BÌNH
        //sắp mảng tăng dần theo điểm tb
        //lí thuyết, bạn [0] sẽ phải có điểm 5
        //               [1]                 9
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ 10 bạn sv
        //10 biến/ tên tắt + 10 value phức tạp ~~~ 10 nhát new () cái đã
        //lưu 10 số tự nhiên
        //10 biến/ tên tắt + 10 vclaue đơn
        //int a1, a2, a3, a4,...
        //int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
        //= value đơn từ từ
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13; //LẺ
        //s1 = ngoặc tròn
        //      x[0] x[1]   x[2]  x[3]   x[4]
        //          x[0].
        Student list[] = new Student[3];    //đừng nhầm lân khi new, 2 loại ngoặc
        // () gọi phễu 1 object
        // []  tao cần ? biến đối tượng

        //[] dành cho nhiều biến, nhiều tên gọi tăt                                    
        list[0] = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        list[1] = new Student("SE123457", "BINH LE", 2000, 5.7);
        list[2] = new Student("SE123458", "CUONG VO", 1999, 5.8);
        //mấy con trỏ còn lại mang giá trị gì?? biến Student chưa gán mang 
        //giá trị gì
        //list[3] ... list[9]??? 0 là DEFAULT
        //                  TRỎ VÀO TỌA ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 CỦA RAM
        //                     BYTE ĐẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ OFOFOFOF
        //tức là byte đầu tiên( thứ 0) tọa độ thứ ko của ram chứa toàn bộ số 0
        //IN MẢNG CÁI COI
        System.out.println("The list of Student ");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chỉ là 1 biến Student x thoy mà
        }

        s1 = null; //tao trỏ đáy ram heng, null heng, làm biếng new,
        //có value rồi, số 0, tọa độ 0 ở đáy ram, đi vào 000
        s1.showProfile(); // có mẹ gì mà show, NullPointerException

        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GẮN VALUE ĐẾN ĐÂU. FOR ĐÊN ĐÓ, KO FOR ĐẾN. LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
    }

    public static void playWithStudentObject() {
        Student x;  //tớ sẽ nói về 1 đứa hen
        x = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20}; //new ngầm, ko nói rõ việc new, thực ra có 
        int arr2[] = new int[]{5, 10, 15, 20};
        int arr3[] = new int[5];

        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu!!!
        arr[0] = 5; //int a = 5;
        arr[1] = 10;    //int b = 10;
        arr[2] = 15;    //int c = 15

        //arr là gì, mày là 1 biến db, mày là 1 biến object luôn, vì trỏ 1 vùng new
        //có quyền chấm, chấm cái gì???, tệ nhất là .toString()
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là 
        //phần tử của mảng
        //arr[0] ~~~~~~arr.get(thằng thứ 0) -> đc 5 / arr[0] đc 5
        //arr.length - biến lưu dđ của 1 mảng, có bao nhiêu phần tử
        // -> static hay non??
        //arr.lenght; //hằng số db, ăn theo từng mảng, mỗi mảng sẽ kahcs nhau size
        System.out.println("Array has: " + arr);
        //gọi thầm tên em, convert data của
        //các biến thành mã hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr . xổ ra gì???   public của vùng new
        //arr. xổ ra cái gì? xổ cái đầu mày, tao là primitive, tên biến phức tạp
        //nhưng tao vẫn đơn giá trị (tên tao có ngoặc vuông do trùng tên
        //                          nhưng tao là tên cho value đơn giản)
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        //get() set() ko có mà thay = chơi trực tiếp []
        //thay đổi value bên trong biến/ phần tử
    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //biến ct    new object()
        //      ref     new object()

        double arr[] = new double[1001]; //default gán hết = 0
        //new() là phễu để đúc object!!!!!
        //emm muốn cso 365 biến double, nó là biến lẻ nè ne
        //          arr[0], arr[1], arr[i]...

        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr[0] éo xổ gì vì nó biến primitive
        //arr.length
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIEENNS CON TRỎ, REFERENCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ LỬA NEW ĐÓ, KO ĐÚC TRUYỀN THỐNG
        //                                          MÀ LÀ ĐÚC NHIỀU TIỀN
        //MÁ MÌ SẼ QUẢN LÍ BAO NHIÊU CHÁU DƯỚI QUYỀN, DĐ CẢU MÁ MÌ
        //MÁ MÌ CHẤM RA ĐC SỐ LÍNH
        //arr.
        System.out.println("\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void playWithPrimitiArray() {
        //double vol[365]; //java cấm khai báo kích thước mảng, số phần tử trong []

        //float v[365] = {0, 0, 5, 10, 15, 20, 25};
        float v[] = {0, 0, 5, 10, 15, 20, 25};  //mảng có 7 phần tử, có sẵn lun value
        //7 biến float v[0] = 0; v[1] = 0; v[2] = 5,..
        //7 biến float nằm trên HEAP đấy
        System.out.println("the array has values of (printed by individual)");

        v[0] = 6868;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }

        //ta có thể xem mảng như là 1 tập hợp các vcalue trong dấu {} giống toán
        //ta có thể xài khái niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (float x : v) {
            //x = v[0], x = v[1], x = v[2], x = v[i] với mọi x là 1 biến lẻ, = từng 
            //thằng lẻ trong mảng sỉ
            //sout(v[i]) ~~~~~~~~~~~sout(x)
            System.out.print(x + " ");
        }
        //N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,....}
        //V x e N, x là mấy, x là bất kỳ trong N
        //        x = 0, x = 1, x = 2, x = 3
        //với mọi là kĩ thuật quét qua mảng
        //dùng đèn pin quét qua từ đầu đến cuối 
        //kĩ thuật dùng là 1 con số tự nhiên
        //duyệt qua tất cả phần tử của tập hợp
        //V integer x e N, x = N[0]  x = N[1] x = N[2]
    }
}
