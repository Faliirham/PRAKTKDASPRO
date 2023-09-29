import java.util.Scanner;

public class PemilihanPercobaan110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan Angka:  ");
        int angka = input10.nextInt();

      int bilangan;
        bilangan = angka % 2;
        String pesan = bilangan == 0 ? "Bilangan genap" : "Bilangan ganjil";
        System.out.print("Angka " +angka+ " adalah " + pesan );
        
    }
    
}