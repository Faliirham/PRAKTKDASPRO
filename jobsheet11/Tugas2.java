package jobsheet11;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan Nilai N : ");
        int N = sc.nextInt();

        if (N<5) {
            System.out.println("Nilai N minimal harus 5");
        }else{
            for(int i = 0; i < N; i++) {
                for(int j = N; j >i; j--) {
                    System.out.print("*");
                    }    
             System.out.println();
            }
        } 
        sc.close();
    }
}
