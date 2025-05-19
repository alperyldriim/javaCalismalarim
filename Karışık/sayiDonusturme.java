import java.util.Scanner;

public class sayiDonusturme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Değer giriniz: ");
        int sayi = sc.nextInt() ;

        if (sayi % 2 == 0) {
            System.out.println("Girilen " +sayi+ " Sayısının İkilik Tabanındaki Eşiti: " +ikilik(sayi));
            System.out.printf("Girilen " +sayi+ " Sayısının Sekizlik Tabanındaki Eşiti: " +sekizlik(sayi));
        } else {
            System.out.println("Girilen " +sayi+ " Sayısının İkilik Tabanındaki Eşiti: " +ikilik(sayi));
            System.out.printf("Girilen " +sayi+ " Sayısının Sekizlik Tabanındaki Eşiti: " +sekizlik(sayi));
        }
        String yazi = "yazi" ;
        yazi.replace('a' ,'z') ;
        System.out.println(yazi);
    }

    static int logaritma(int a) {
        int logaritma = (int) (Math.log(a) / Math.log(2)) ;
        return  logaritma ;
    }
 
    static int ikilik(int a) {
        int carpma;
        int toplam = 0 ;
        while (a != 0) {
            if (a == 1) {
                toplam += 1 ;
                break;
            } else {
                carpma = (int) Math.pow(10 , logaritma(a)) ;
            }
            toplam += carpma ;
            a -= (int) Math.pow(2 , logaritma(a)) ;
        }
        return toplam;
    }

    static int sekizlik(int a) {
        int sayac = 0 , toplam = 0 , ksayi , sayac2 = 0 , ttoplam = 0;
        int temp = ikilik(a) ;
        while (temp != 0) {
            int sayi = temp % 1000;
            temp -= sayi ;
            temp /= 1000;
            while (sayi != 0) {
                ksayi = sayi % 10 ;
                sayi -= ksayi ;
                sayi /= 10 ;
                toplam += (ksayi * Math.pow(2, sayac)) ;  
                sayac++;  
            }
            ttoplam += (toplam * Math.pow(10 , sayac2)) ;
            toplam = 0 ;
            sayac = 0;
            sayac2++;
        }
        return ttoplam ;
    }
}