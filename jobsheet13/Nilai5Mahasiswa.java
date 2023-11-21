package jobsheet13;
import java.util.Scanner;

public class Nilai5Mahasiswa {
    static Scanner sc = new Scanner(System.in);
    //Fungsi memasukkan daftar Mahasiswa 
    static void InputMahasiswa (String[] namaMahasiswa, int jmlh){
        for(int i = 0; i<jmlh; i++){
            System.out.println("Masukkan nama Mahasiswa ke-"+(i+1));
            namaMahasiswa[i]=sc.next();
        }
    }
    // Fungsi Inputan Nilai Mahasiswa
    static void InputData(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] );
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Masukkan nilai minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi Menampilkan seluruh nilai Mahasiswa
    static void MenampilkanNilai(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Data Nilai "+namaMahasiswa[i]);
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.println("Nilai Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }

    // Fungsi untuk mencari Nilai tertinggi pada minggu keberapa
    static void NilaiTertinggi(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        int mingguTertinggi = 1;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguTertinggi = j + 1;
                }
            }
        }
        System.out.println("Pada minggu ke-" + mingguTertinggi +
                "\nterdapat nilai tertinggi di banding minggu lain sebesar :" + nilaiTertinggi);
    }

    // Fungsi Menampilkan Mahasiswa yang memiliki nilai tertinggi
    static void NilaiTinggi(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        int mingguTertinggi = 1;
        int nilaiTertinggi = 0;
        String nama = namaMahasiswa[0]; 

        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mingguTertinggi = j + 1;
                    nama = namaMahasiswa[i];
                }
            }
        }
        System.out.println("Mahasiswa yang memiliki Nilai tertinggi adalah " + nama +
        "\ndengan nilai sebesar "+nilaiTertinggi+" pada minggu ke-" + mingguTertinggi);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Mahasiswa :");
        int jmlh = sc.nextInt();
        System.out.print("Masukkan Jumlah Tugas :");
        int tgs = sc.nextInt();

        String[] namaMahasiswa = new String[jmlh];
        int[][] nilaiMahasiswa = new int[jmlh][tgs];

        InputMahasiswa(namaMahasiswa, jmlh);
        InputData(namaMahasiswa, nilaiMahasiswa);
        MenampilkanNilai(namaMahasiswa, nilaiMahasiswa);
        NilaiTertinggi(namaMahasiswa, nilaiMahasiswa);
        NilaiTinggi(namaMahasiswa, nilaiMahasiswa); 
    }
}
