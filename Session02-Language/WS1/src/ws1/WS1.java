/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws1;

/**
 *
 * @author ACER
 */
public class WS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean result = isPrime(0);
        System.out.println("o: " + result);
        System.out.println("100: " + isPrime(100));
        System.out.println("101: " + isPrime(101));
        printPrimeList();
    }
    
    //in các số ngt từ 1..100
    public static void printPrimeList() {
        System.out.println("The list of primes from 1..1000");
        for (int i = 1; i<=1000; i++)
            if (isPrime(i)) //if (điều gì true thì làm tiếp trong if)
                System.out.print(i + " ");
    }
    
    public  static boolean isPrime(int n){
        if (n<2)
            return false;

        //else rồi đấy nếu cpu đến đây, n>=2
        //kiểm tra xem trog khoảng từ 2 ... căn(n)
        //lỡ tay chia hết đứa nào ko, có kl ngay ko nguyên tốc
        if (n == 2)
            return true;
        //for 2...căn n, n ơi, mày có chia hết đứa nào từ 2... căn ???
        for (int i=2; i<Math.sqrt(n); i++){
            if (n % i == 0)
                return false;   //n maày lỡ tay chia hết trong [2..căn]
            //hết for rồi mà ko thoát sớm, đích thị ko chia hết đưứa nào
            //sure nguyên tố
        }
        return true;
    }
}
