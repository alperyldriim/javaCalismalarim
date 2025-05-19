import java.util.Scanner;

public class UcgenCizme {
    public static void main(String[] args) {
        int ucgenBuyuklugu , sayacen , j , a;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Üçgenin Uzunluğunu Giriniz: ");
        ucgenBuyuklugu = sc.nextInt();
        sayacen = ucgenBuyuklugu-1 ;
        j = 1;
        for (int i = 0 ; i < ucgenBuyuklugu ; i++) {
            a = 1;
            while (a == 1) {
                int sayac1 = 0 , sayac2 = 0;
                while (sayacen > sayac1) {
                    System.out.print(" ");
                    sayac1++;
                }
                sayac1 = 0 ;
                while (j > sayac2) {
                    System.out.print(".");
                    sayac2++;
                }
                sayac2 = 0 ;
                while (sayacen > sayac1) {
                    System.out.print(" ");
                    sayac1++;
                }
                sayac1 = 0 ;
                sayacen -= 1 ;  
                a = 0; 
                j += 2 ;
            }
            System.out.println();
        }
    }
}
