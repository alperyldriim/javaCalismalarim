import java.util.Scanner;

public class sifreOdevi2 {
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
        if (((sifre.length() >= 8)) && rakam(sifre) && harf(sifre)) {
            return true ;
        } else {
            return false ;
        }
    }

    static boolean rakam(String sifre) {
        int kacTane = 0 ;
        String rakam = "0123456789" ;
        for (int i = 0; i < rakam.length(); i++) {
            for (int j = 0; j < sifre.length(); j++) {
                if (rakam.charAt(i) == sifre.charAt(j)) {
                    kacTane++;
                }
            }
        }
        if (kacTane >= 2) {
            return true ;
        } else {
            return false ;
        } 
    }

    static boolean harf(String sifre) {
        sifre = sifre.toLowerCase() ;
        String harf = "asdfghjklşizxcvbnmöçqwertyuıopğü0123456789" ;
        int kacTane = 0 ;
        for (int i = 0 ; i < harf.length() ; i++) {
            for (int j = 0 ; j < sifre.length() ; j++) {
                if (harf.charAt(i) == sifre.charAt(j)) {
                    kacTane++;
                }
            }
        }
        if (kacTane == sifre.length()) {
            return true ;
        } else {
            return false ;
        }
    }
}
