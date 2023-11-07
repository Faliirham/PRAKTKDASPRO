package jobsheet11;

import java.util.Scanner;

public class Nestedloop_2341720121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Double [][] temps = new Double[5][7];

        for (int i = 0; i < temps.length ; i++) {
            System.out.println("Kota ke-" +i);
                for (int j = 0; j < temps.length; j++){
                    System.out.print("Hari ke-"+(j+1)+": ");
                    temps[i][j]=sc.nextDouble();
                }
            System.out.println();
        }

        for(Double [] kota : temps ){
            for (Double suhu : kota) {
                System.out.println(suhu+" ");
            }
                
            System.out.println();
        }
    }
}
