import java.util.Scanner;

public class sifreOdevi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String sifre ;
        System.out.print("Lütfen Geçerli Bir Şifre Giriniz: ");
        sifre = sc.nextLine() ;
        if (sifreKontrol(sifre)) {
            System.out.println("Geçerli Şifre Girdiniz");
        } else {
            System.out.println("Geçersiz Şifre Girdiniz!");
        }
    }

    static boolean sifreKontrol(String sifre) {
        if (uzunlukKontrol(sifre) && rakamKontrol(sifre) && harfKontrol(sifre)) {
            return true ;
        } else {
            return false ;
        }
    }

    static boolean uzunlukKontrol(String sifre) {
        if (sifre.length() >= 8) {
            return true ;
        } else {
            return false ;
        }
    }

    static int rakam(String sifre) {
        int kacTane = 0 ;
        String rakam = "0123456789" ;
        for (int i = 0; i < rakam.length(); i++) {
            for (int j = 0; j < sifre.length(); j++) {
                if (rakam.charAt(i) == sifre.charAt(j)) {
                    kacTane++;
                }
            }
        }
        return kacTane ;
    }

    static boolean rakamKontrol(String sifre) {
        if (rakam(sifre) >= 2) {
            return true ;
        } else {
            return false ;
        }
    }

    static int harf(String sifre) {
        sifre = sifre.toLowerCase() ;
        String harf = "asdfghjklşizxcvbnmöçqwertyuıopğü" ;
        int kacTane = 0 ;
        for (int i = 0 ; i < harf.length() ; i++) {
            for (int j = 0 ; j < sifre.length() ; j++) {
                if (harf.charAt(i) == sifre.charAt(j)) {
                    kacTane++;
                }
            }
        }
        return kacTane ;
    }

    static boolean harfKontrol(String sifre) {
        int toplam , uzunluk ;
        toplam = harf(sifre) + rakam(sifre) ;
        uzunluk = sifre.length() ;
        if (toplam == uzunluk) {
            return true ;
        } else {
            return false ;
        }
    }
}
