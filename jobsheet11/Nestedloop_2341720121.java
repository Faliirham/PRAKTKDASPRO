package jobsheet11;

import java.util.Scanner;

public class Nestedloop_2341720121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double[][] temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Data array:");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i + ":");
            for (Double suhu : temps[i]) {
                
                System.out.println("Suhu "+suhu);
                
                
            }
            double totalSuhu = 0.0;
            for (Double suhu : temps[i]) {
                totalSuhu += suhu;
            }
            double rataRata = totalSuhu / temps[i].length;
            System.out.println("  Rata-rata suhu kota ke-" + i + ": " + rataRata);
        }

        sc.close();
    }
}
