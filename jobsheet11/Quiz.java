package jobsheet11;
import java.util.Random;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();


        char menu = 'y';
        do {
           int number = random.nextInt(10)+1;
           boolean succes = false;
           do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                succes = (answer==number);
                if(answer<number){
                    System.out.println("tebakan anda lebih kecil dari jawaban");
                }else if (answer>number){
                    System.out.println("tebakan anda lebih besar dari jawaban");
                }else{
                    System.out.println("tebakan anda benar");
                }
           } while (!succes); 
           System.out.print("Apakah anda ingin mengulang permainan (y/Y)? : ");
           menu = input.nextLine().charAt(0);
        } while (menu=='y'||menu=='Y');
    }
}
