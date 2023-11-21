package jobsheet13;
import java.util.Scanner;
public class Kubus10 {
    static int HitungVolume (int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int HitungLuasPermkaan (int sisi){
        int luasPermkaan = sisi*sisi*6;
        return luasPermkaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sisi,volume,lpermukaan;
        System.out.print("Masukkan panjang Sisi pada kubus : ");
        sisi = sc.nextInt();


        volume = HitungVolume(sisi);
        System.out.println("Volume Kubus adalah : "+volume);
        lpermukaan= HitungLuasPermkaan(sisi);
        System.out.println("Luas Permukaan Kubus adalah : "+lpermukaan);
    }
}
