import java.util.Scanner;

public class PemilihanPercobaan210 {
    public static void main(String[] args) {
        Scanner input210 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input210.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input210.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input210.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input210.nextFloat();

        float total = (uas * 0.4F ) + (uts * 0.3F) + (kuis * 0.15F) + ( tugas * 0.2F);

       
        String grade;
        if (total > 80 )
             grade = "A (Sangat Baik)" ;
        else if (total > 73)
            grade = "B+ (Lebih dari Baik)"; 
        else if (total > 65)
            grade ="B (Baik)";
        else if (total> 60)
            grade ="C+ (Lebih dari Cakup)";
        else if (total >50)
            grade="C (Cukup)";
        else if (total > 39) 
            grade = "D (Kurang)";
        else 
            grade = "E (Gagal)";
        

            System.out.println("Nilai Total anda : " +total+ " Grade anda adalah " +grade);
            
        
       input210.close();
    }

}
