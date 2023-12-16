package jobsheet14;
import java.util.Scanner;
public class Tugas1 {
    

        // Fungsi rekursif
        static int deretDescendingRekursif(int n) {
            // Base case: jika n kurang dari 0
            if (n <= 0) {
                return(n);
            }else{
                System.out.print(n + " ");
    
          
            return(deretDescendingRekursif(n - 1));
            }
            
            // Menampilkan nilai n
            
        }
    
        // Fungsi iteratif
        static void deretDescendingIteratif(int n) {
            // Loop dari n sampai 0 dan menampilkan nilai
            
            for (int i = n; i >= 0; i--) {
               System.out.print(i+" ");
                
            }

        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.print("Masukkan Nilai n : ");
            int msk = sc.nextInt();
            //Dungsi Rekursif
            System.out.println(deretDescendingRekursif(msk)); 
            //Fungsi Iteratif
            deretDescendingIteratif(msk);  

            sc.close();
        }
}