import java.util.Scanner;

public  class Pemilihan2Percobaan110 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner (System.in);

        int tahun;
        System.out.print(" Masukkan tahun : ");
        tahun = input10.nextInt();

        if ((tahun % 4)==0 || (tahun % 400) ==0) {
            if ( (tahun % 100)!= 0 ){ 
            System.out.println(" Tahun kabisat ");
            }else{
                if ((tahun % 400)==0){
                System.out.println("Tahun Kabisat");
                }else
                System.out.println("Bukan Tahun Kabisat");
            }
        
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }

        input10.close();
     }

    } 
