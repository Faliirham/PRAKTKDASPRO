package jobsheet14;
import java.util.Scanner;
public class Tugas3 {

    static void CekPrimaRekursif (int N){
        if (N%N==0){
            System.out.println("N bilangan Prima");
        }else {
            System.out.println("N bukan bilangan prima");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int mskn = sc.nextInt();

        CekPrimaRekursif(mskn);

        sc.close();
    }
}
