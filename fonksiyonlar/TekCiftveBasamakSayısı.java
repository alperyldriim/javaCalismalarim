import java.util.Scanner;

public class TekCiftveBasamakSayısı {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Bir Değer Giriniz: ");
        int sayi = sc.nextInt();

        System.out.println("Girilen Değerin Basamak Sayısı: " + basamak(sayi));
        System.out.println("Girilen Değerin Tek Sayılar Toplamı: " + tekToplam(sayi));
        System.out.println("Girilen Değerin Çift Sayılar Toplamı: " + cıftToplam(sayi));
        System.out.println("Girilen Değerin Tek ve Çift Sayılarının Mutlak Farkı: " + mutlakFark(sayi));
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

static boolean tekMi(int a) {
    if (a % 2 == 1) {
        return true ;
    } else {
        return false ;
    }
}


static boolean cıftMi(int a) {
    if (a % 2 == 0) {
        return true ;
    } else {
        return false ;
    }
}


static int cıftToplam(int a) {
    int toplam = 0 , kalan;
    while (a != 0) {
        kalan = a % 10 ;
        if (cıftMi(kalan)) {
            toplam += kalan ;
        }
        a -= kalan ;
        a /= 10 ;
    }
    return toplam ;
}

static int tekToplam(int a) {
    int toplam = 0 , kalan;
    while (a != 0) {
        kalan = a % 10 ;
        if (tekMi(kalan)) {
            toplam += kalan ;
        }
        a -= kalan ;
        a /= 10 ;
    }
    return toplam ;
}

static int rakamlarToplamı(int a) {
    int toplam = 0 ;
    toplam += tekToplam(a) ;
    toplam += cıftToplam(a) ;
    return toplam ;
}

static int mutlakFark(int a) {
    int toplam ;
    toplam = cıftToplam(a) - tekToplam(a) ;
    return Math.abs(toplam) ;
}

}

