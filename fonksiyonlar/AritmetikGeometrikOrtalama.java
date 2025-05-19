import java.util.Scanner;

public class AritmetikGeometrikOrtalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Bir Değer Giriniz: ");
        int sayi ;
        sayi = sc.nextInt() ;
        if (cıftMi(sayi)) {
            System.out.println("Girilen Değerin Aritmetik Ortalaması: " + aritmetik(sayi));
        } else {
            System.out.println("Girilen Değerin Geometrik Ortalaması: " + geometrik(sayi));
        }
    }


static double basamak(int a) {
    int kalan;
    double basamak = 0 ;
    while (a != 0) {
        kalan = a % 10 ;
        basamak++;
        a -= kalan ;
        a /= 10 ;
    } return basamak ;
}

static double aritmetik(int a) {
    int toplam = 0 , b = a , kalan;
    double ortalama ;
    while (a != 0) {
        kalan = a % 10 ;
        a -= kalan ;
        a /= 10 ;
        toplam += kalan ;
    }
    ortalama = toplam / basamak(b) ;
    return ortalama ;
}

static double geometrik(int a) {
    int carpım = 1 , b = a , kalan ;
    double ortalama ;
    while (a != 0) {
        kalan = a % 10 ;
        a -= kalan ;
        a /= 10 ;
        carpım *= kalan ;
    }
    ortalama = Math.pow(carpım, (1.0 / basamak(b))) ;
    return ortalama ;
}

static boolean cıftMi(int a) {
    if (a % 2 == 0) {
        return true ;
    } else {
        return false ;
    }
}


}
