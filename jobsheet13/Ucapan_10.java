package jobsheet13;

import java.util.Scanner;

public class Ucapan_10 {
    public static String PenerimaUcapan () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Tuliskan Nama Orang yang ingin anda beri ucapan");
        String namaorang = sc.nextLine();
        sc.close();
        return namaorang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you");
    }
}
