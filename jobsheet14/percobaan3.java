package jobsheet14;
import java.util.Scanner;
public class percobaan3 {
    static double hitunglaba(double saldo, int tahun){
        if(tahun ==0){
            return(saldo);
        }else{
            return(1.11* hitunglaba(saldo, tahun-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Jumlah Saldo awal :");
        int saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        int tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah "+tahun+" tahun : "+hitunglaba(saldoAwal, tahun));

        sc.close();
    }
}
