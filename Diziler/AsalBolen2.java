import java.util.Scanner;

public class AsalBolen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sayiAsalBolen = new int[5000000][2] ;
        int[][] sayiAsalBolen2 = new int[5000000][2] ;
        int asal = 2 , sayi , sayi1sayac = 0 , ksayi , asalbolen = 0 , a = 2 , ekok = 1 , kucuk;
        int asal2 = 2 , sayi2 , sayi2sayac = 0 , ksayi2 , asalbolen2 = 0 , buyuk , ebob = 1;
        System.out.print("1.Değeri Giriniz: ");
        sayi = sc.nextInt();
        System.out.print("1.Değeri Giriniz: ");
        sayi2 = sc.nextInt();
        ksayi = sayi ;
        ksayi2 = sayi2 ;
        while (ksayi != 1) {
            while (ksayi % asal == 0) {
                ksayi /= asal ;
                asalbolen++;
            }
            sayiAsalBolen[sayi1sayac + 2][0] = asal ;
            sayiAsalBolen[sayi1sayac + 2][1] = asalbolen ;
            asalbolen = 0 ;
            asal++;
            sayi1sayac++;
        }

        while (ksayi2 != 1) {
            while (ksayi2 % asal2 == 0) {
                ksayi2 /= asal2 ;
                asalbolen2++;
            }
            sayiAsalBolen2[sayi2sayac + 2][0] = asal2 ;
            sayiAsalBolen2[sayi2sayac + 2][1] = asalbolen2 ;
            asalbolen2 = 0 ;
            asal2++;
            sayi2sayac++;
        }

        sayi1sayac--;
        sayi2sayac--;

        if (sayi1sayac >= sayi2sayac) {
            buyuk = sayi1sayac + 2;
            kucuk = sayi2sayac + 2;
        } else {
            kucuk = sayi1sayac + 2;
            buyuk = sayi2sayac + 2;
        }

        while (a <= kucuk) {
            if (sayiAsalBolen[a][1] >= sayiAsalBolen2[a][1]) {
                ekok *= Math.pow(sayiAsalBolen[a][0], sayiAsalBolen[a][1]) ;
                ebob *= Math.pow(sayiAsalBolen2[a][0], sayiAsalBolen2[a][1]) ;
            } else {
                ebob *= Math.pow(sayiAsalBolen[a][0], sayiAsalBolen[a][1]) ;
                ekok *= Math.pow(sayiAsalBolen2[a][0], sayiAsalBolen2[a][1]) ;
            }
            a++;

        } while (a <= buyuk) {
            ekok *= Math.pow(sayiAsalBolen[a][0], sayiAsalBolen[a][1]) ;
            ekok *= Math.pow(sayiAsalBolen2[a][0], sayiAsalBolen2[a][1]) ;
            a++;
        }

        System.out.println("Girilen " + sayi + " ve " + sayi2 + " Değerlerinin");
        System.out.println("Ebobu: " + ebob + "\nEkoku: " + ekok);

    }
}
