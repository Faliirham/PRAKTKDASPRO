import java.util.Scanner;
public class Bank11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml_tabunagn_awal, lama_menabung;
        double jml_tabungan_akhir, bunga, persentase_bunga = 0.02;
        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabunagn_awal = input.nextInt();
        System.out.println("masukkan lama menabung anda");
        lama_menabung = input.nextInt();
        bunga = lama_menabung*persentase_bunga*jml_tabunagn_awal;
        jml_tabungan_akhir=bunga+jml_tabunagn_awal;
        System.out.println("Jumlah Tabungan akhir anda adalah " +jml_tabungan_akhir);

        input.close();

    }
}