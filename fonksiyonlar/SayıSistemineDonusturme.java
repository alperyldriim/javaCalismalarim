import java.util.Scanner;

public class SayıSistemineDonusturme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10'luk Tabanında Bir Değer giriniz: ");
        int sayi = sc.nextInt() ;

        System.out.println("Girilen " +sayi+ " Sayısının İkilik Tabanındaki Eşiti: " +ikilik(sayi));
        System.out.println("Girilen " +sayi+ " Sayısının Sekizlik Tabanındaki Eşiti: " +sekizlikInt(ikilik(sayi)));
        System.out.println("Girilen " +ikilik(sayi)+ " Sayısının Sekizlik Tabanındaki Eşiti: " +sekizlikStr(ikilik(sayi)));
    }

    public static int logaritma(int deger) {
        int logaritma = (int) (Math.log(deger) / Math.log(2)) ;
        return  logaritma ;
    }
 
    static String ikilik(int deger) {
         if (deger <= 0) {
            return "0" ;
        }
        
        char[] sayi = new char[logaritma(deger)+1] ;
        int dongu = 1 ;
       
        while (deger > 0) {
            int carpma = 1 , us = 0 ;

            while (deger >= carpma) {
                carpma *= 2 ;
                us++ ;
            } 


            if (dongu == 1) {
                sayi[0] = '1' ;
                for (int i = 1; i < us ; i++) {
                sayi[i] = '0';
                } 
            }
            String sayilar1 = new String(sayi);


            if (dongu > 1) {
                sayi[sayilar1.length()-us] = '1' ;
            }
            
            carpma /= 2 ;
            deger -= carpma ;
            dongu++;
        } String sayilar2 = new String(sayi);
        return sayilar2 ;
    }

    static String tersCevir(String deger) {
        String kdeger = "" ;
        for (int i = deger.length() -1 ; i >= 0 ; i--){
            kdeger += deger.charAt(i) ;
        } return kdeger ;
    }

    static String uzunlukUcunKatıMı(String deger) {
        while (deger.length() % 3 != 0) {
            deger = 0 + deger ;
        }
        return deger ;
    }


    static int sayiyiUcerliParcala(String deger) {
        int toplam = 0 ;
        for (int i = 0; i < deger.length() ; i++) {
            int basamak = Integer.parseInt(deger.substring(i, i+1)) ;
            toplam += Math.pow(2, 2-i) * basamak;
        }
        return toplam ;
    }


    static int sekizlikInt(String deger) {
        deger = uzunlukUcunKatıMı(deger) ;
        int toplam = 0 ;
        String ilkUc ;
        while (deger.length() != 0) { 
            ilkUc = deger.substring(0, 3) ;
            deger = deger.substring(3) ;
            toplam *= 10 ;
            toplam += sayiyiUcerliParcala(ilkUc) ;
        }
        return toplam ;  
    }

    static String sekizlikStr(String deger) {
        deger = uzunlukUcunKatıMı(deger) ;
        String ilkUc , toplam = "";
        while (deger.length() != 0) { 
            ilkUc = deger.substring(0, 3) ;
            deger = deger.substring(3) ;
            toplam += sayiyiUcerliParcala(ilkUc) ;
        }
        return toplam ; 
    }
}
