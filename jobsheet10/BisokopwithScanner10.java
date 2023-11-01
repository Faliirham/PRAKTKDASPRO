package jobsheet10;
import java.util.Scanner;

public class BisokopwithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    sc.nextLine(); // membersihkan newline
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    
                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton telah disimpan.");
                        } else {
                            System.out.println("Kursi di baris " + baris + ", kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1]);
                            System.out.println("Masukkan baris dan kolom kembali pada baris dan kolom yang belum terisi");
                        }
                    } else {
                        System.out.println("Baris atau kolom tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
                    break;
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.next();
            if (next.equalsIgnoreCase("n")) {
                sc.close();
                break;
            }
        }
    }
}
