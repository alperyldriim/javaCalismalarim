public class PolindromSayi {
    public static void main(String[] args) {
        System.out.println("Polindrom Sayı: "+ polindrom(121)); 

    }

    static boolean polindrom(int a) {
        int kalan , yeni = 0 , ka = a;
        while (a != 0) {
            kalan = a % 10 ;
            a -= kalan ;
            a /= 10 ;
            yeni *= 10 ;
            yeni += kalan ;
        }

        if (ka == yeni) {
            return true ;
        } else {
            return false ;
        }
    }
}

