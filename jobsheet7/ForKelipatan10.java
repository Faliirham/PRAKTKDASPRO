package jobsheet7;

import java.util.Scanner;

public class ForKelipatan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, total  = 0, counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();


        for (int i = 1; i <= 50; i++) {
            if ((i % kelipatan) == 0) {
                total += i;
                counter++;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        double rata = (double) total / counter;
        System.out.printf("Nilai dari rata rata kelipatan %d dari 1 sampai 50 adalah %.1f\n",kelipatan,rata);
        sc.close();
    }
}
