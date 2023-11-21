package jobsheet13;
import java.util.Scanner;

public class Percobaan6_10 {
    static int Hitungluas (int p,int l){
        int luas = p*l;
        return luas;
    }
    static int HitungVolume (int p,int l,int t){
        int vol = p*l*t;
        return vol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int p,l,t,L,vol;
        System.out.print("Masukkan Panjang :");
        p=sc.nextInt();
        System.out.print("Masukkan lebar :");
        l=sc.nextInt();
        System.out.print("Masukkan tinggi :");
        t=sc.nextInt();

        L=Hitungluas(p, l);
        System.out.println("Luas persegi panjang adalah : "+L);
        vol=HitungVolume(p, l, t);
        System.out.println("Volume persegi panjang adalah : "+vol );

    }
}
