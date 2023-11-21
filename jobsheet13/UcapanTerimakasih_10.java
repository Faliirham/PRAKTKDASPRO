package jobsheet13;

import java.util.Scanner;

public class UcapanTerimakasih_10 {
    static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan:");
        String namaorang = sc.nextLine();
        
        return namaorang;
    }

    static String UcapanTambahan(String nama) {
       
        System.out.println("Berikan ucapan tambahan kepada " + nama + ":");
        Scanner sc = new Scanner(System.in);
        String ucapan = sc.nextLine();
        sc.close();
        return ucapan;
    }

    static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan(nama); 
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.\n" +
                 tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
