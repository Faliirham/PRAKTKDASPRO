package jobsheet11;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner  (System.in);

        System.out.print("Masukkan Nilai N : ");
        int N = sc.nextInt();
        for (int iout = 1; iout <= N; iout++) {
            for (int i = 1; i <= N; i++) {
            System.out.print("*");
            
            }    
            System.out.println();
        }
        sc.close();
    }
}
