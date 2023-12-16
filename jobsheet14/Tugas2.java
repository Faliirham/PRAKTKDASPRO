package jobsheet14;

import java.util.Scanner;

public class Tugas2 {

    static int PenjumlahanRekursif(int f){
        if(f == 0){
            return (f);
        }else{
            return (f+(PenjumlahanRekursif(f-1)));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Nilai F : ");
        int mskn = sc.nextInt();
        for(int i = 1;i <= 10;i++){
                System.out.print(i+"+");
            }
            System.out.print("="+PenjumlahanRekursif(mskn));
        
        sc.close();
    }
}
