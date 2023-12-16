package jobsheet14;
import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y==0){
            return (1);
        }else{
            return (x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc.nextInt();


        for(int i = 0; i < pangkat; i++){
            System.out.print(bilangan);
            if(i < pangkat -1){
                System.out.print("x");
            }
        }
        System.out.print(" = "+hitungPangkat(bilangan, pangkat));
        sc.close();
    }
}
