import java.util.Scanner;

public class Hargabayar11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkbuku;
        int harga,jumlah,jumlhHlmn;
        double dis, total, bayar,jmlhDis;
        System.out.print("Masukkan Merk Buku yang dibeli : ");
        merkbuku=input.nextLine();
        System.out.print("Masukkan jumlah halaman buku : ");
        jumlhHlmn=input.nextInt();
        System.out.print("Masukkan Harga yang dibeli : ");
        harga=input.nextInt();
        System.out.print("Masukkan Jumlah Baranh yang dibeli : ");
        jumlah=input.nextInt();
        System.out.print("Masukkan Dsikon yang didapat : ");
        dis=input.nextInt();
        total=harga*jumlah;
        jmlhDis=total*dis;
        bayar=total-jmlhDis;
        System.out.print("Buku yang anda beli adalah : "+merkbuku);
        System.out.print("Diskon yang anda dapatkan adlah " +jmlhDis);
        System.out.print("Jumlah Yang Harus di bayar "+bayar);
        
        input.close();
    }
}
