package jobsheet7;
import java.util.Scanner;
public class DoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambi cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();

                if(jumlahHari<=jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " +jatahCuti);
                }else {
                    System.out.println("Jumlah  hari cuti yang anda minta melebihi jatah cuti ");
                    ;
                }
            }else{
                System.out.print("Program berhenti");
            }

        } while (konfirmasi.equalsIgnoreCase("y") && jatahCuti > 0);

        sc.close();
    }
    
}
