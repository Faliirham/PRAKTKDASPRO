package jobsheet13;

public class Terimakasih_10 {
   static void UcapanTerimakasih() {
    System.out.println("Thank you for being the best teacher in the world.\n"+
    "You inspired in me a love for learning and made me feel like i could ask you anytihng");
   
   } 
   static void UcapanTambahan (String ucapan ){
      System.out.println(ucapan);
   } 
    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terimakasih Pak.. Bu.. Semoga sehat selalu";
        UcapanTambahan(ucapan);
   }
}
