import java.util.Scanner;

public class Gaji11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
     
        int jmlMasuk, jmlTdkmasuk, totgaji,gaji, potGaji;
        System.out.println("Masukkan Jumlah Hari masuk Kerja Anda :  ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlTdkmasuk=input.nextInt();
        System.out.println("Masukkan besar gaji anda ");
        gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji");
        potGaji=input.nextInt();

        totgaji=(jmlMasuk*gaji)-(jmlTdkmasuk*potGaji);
        System.out.println(" Gaji yang anda terima adalah :  "+totgaji);

        input.close();

    }
}
