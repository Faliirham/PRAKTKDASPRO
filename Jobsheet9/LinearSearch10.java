package Jobsheet9;

import java.util.Scanner;

public class LinearSearch10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah element : ");
        int jumlahElement = sc.nextInt();

        int [] arrayint = new int[jumlahElement];
        int hasil = 0;
       
        for (int i = 0; i < arrayint.length; i++) {
        System.out.print("Masukkan element ke-"+(i)+" : ");
        arrayint[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        int key = sc.nextInt();
        
        for (int i = 0; i < arrayint.length; i++) {
            if (arrayint[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == 0) {
            System.out.println("Key tidak ditemukan");
        } else {
            System.out.println("Key ditemukan di index "+hasil);
        }

        sc.close();
    }
}
