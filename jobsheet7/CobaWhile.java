package jobsheet7;

public class CobaWhile {
    public static void main(String[] args) {
        int i = 25;
        int deret = 0;

        while (i>=1) {
            deret += i;
            i--;
        }
        System.out.println("Hasil penjumlahan deret : "+deret);
    }
}
