package jobsheet13;

public class Programku {
    static void TampilHinggaKeI(int i){
        for (int j =1;j<=i;j++){
            System.out.print(j);
        }
    }
    static int Jumlah(int bil1,int bil2){
        return (bil1+bil2);
    }
    static void TampilJumlah (int bil1, int bil2){
        TampilHinggaKeI(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp= Jumlah(1,1);
        TampilJumlah(temp, 5);
    }
}