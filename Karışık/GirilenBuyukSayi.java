import java.util.Scanner;

public class GirilenBuyukSayi {
    public static void main(String[] args) {
        int sayac = 2 , n , sayi1 , sayi2 , buyuk;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Adedini Giriniz: ");
        n = sc.nextInt();
        System.out.print("1.Değeri Giriniz: ");
        sayi1 = sc.nextInt();
        buyuk = sayi1;
        while(sayac <= n) {
            System.out.print(sayac + ".Değeri Giriniz: ");
            sayi2 = sc.nextInt();
            if (sayi2 >= buyuk) {
                buyuk = sayi2 ;
            }
            sayac++;
        }
        System.out.println("Büyük Sayı: " + buyuk);
    }
}

