package jobsheet10;

public class Bioskop10 {
    public static void main(String[] args) {
        String [] [] penonton  = new String [4] [2];
        penonton [0][0] ="Amin";
        penonton [0][1] ="Bena";
        penonton [1][0] ="Candra";
        penonton [1][1] ="Dela";
        penonton [2][0] ="Eka";
        penonton [2][1] ="Farhan";
        penonton [3][0] ="Gisel";
        penonton [3][1] ="Hana"; 


        System.out.println(penonton.length);
       //menampilkan panjang setiap baris pada array menggunakan for loop
        for (int i = 0; i < penonton.length; i++){
            System.out.println("panjang baris ke-"+ (i+1)+ ":" + penonton[i].length);
        }
        //menampilkan panjang setiap baris pada array menggunakan foreach loop
        for(String [] barispenonton : penonton) {
            System.out.println("panjang baris : "+barispenonton.length);
        }
        //menampilkan nama penonton untuk setiap baris
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("penonton pada baris ke-"+(i+1)+" : "+String.join(", ", penonton[i]));
        }
    }
}