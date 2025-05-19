public class GirilenSayınınKareleriToplamı {
    public static void main(String[] args) {

        int sayi = 345 , sayibir , sayion , sayiyuz , toplam = 0 , ksayi;
        ksayi = sayi ;

        if (sayi < 100 || sayi > 1000) {
            System.out.println("Sayının 3 Basamaklı Olduğundan Emin Olunuz!");
        } 
        
        else {
            sayibir = sayi % 10 ;
            toplam += Math.pow(sayibir , 2) ;
            sayi -= sayibir ;
            sayi /= 10 ;
            sayion = sayi % 10 ;
            toplam += Math.pow(sayion , 2) ;
            sayi -= sayion ;
            sayi /= 10 ;
            sayiyuz = sayi ;
            toplam += Math.pow(sayiyuz , 2) ;
            System.out.println(ksayi + " Sayısının Rakamlarının Kareleri Toplamı: " + toplam);
        }
    }
}
