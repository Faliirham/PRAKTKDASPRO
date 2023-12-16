package jobsheet14;
import java.util.Scanner;
public class Tugas4 {
    
    static int hitungPasanganMarmut(int bulan) {
        // Base case: bulan ke-0 hanya ada satu marmut
        if (bulan == 1 || bulan == 2) {
            return 1;
        }else if(bulan < 1) {
            return 0;
        }else {
            return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 1);
        }
    }
        
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);

                System.out.print("Masukkan jumlah bulan : ");
                int bulan = sc.nextInt();
        
                System.out.println("Bulan|\t|pasangan prosuktif|\t|Pasangan Belum produktif|\t|Total Pasangan");
                System.out.println("=================================================================================");
                
                for (int i = 1; i <= bulan; i++) {
                    int totalPasangan = hitungPasanganMarmut(i);
                    int jumlahPasangan = hitungPasanganMarmut(i - 1);
                    int blmproduktif = hitungPasanganMarmut(i - 2);
                    System.out.println(i + "\t\t" +blmproduktif+"\t\t\t"+ jumlahPasangan + "\t\t\t\t" + totalPasangan);
                }
                
                sc.close();
            }
        }
        
    
