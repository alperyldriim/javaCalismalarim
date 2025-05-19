import java.util.Scanner;

public class EratosthenesKalburu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("\nAsal Sayıları Bulma Yazılımına Hoşgeldiniz :)\n");

        System.out.print("Max Sayıyı Giriniz: ");
        int sayi = sc.nextInt() ;

        System.out.println();
        int elemanSayisi = sayi-1 ;
        int[] sayıDizisi = new int[elemanSayisi] ;

        for (int i = 0; i < elemanSayisi; i++) {
            sayıDizisi[i] = i+2 ;
        }

        int asalSayac = 0 ;
        while (asalSayac < elemanSayisi-1) {
            for (int sayıSayac = asalSayac+1; sayıSayac < elemanSayisi; sayıSayac++) {
                if (sayıDizisi[sayıSayac] % sayıDizisi[asalSayac] == 0) {
                    sayıDizisi = silSayi(sayıDizisi, sayıSayac, elemanSayisi) ;
                    elemanSayisi-- ;
                }
            }
            asalSayac++;
        }

        System.out.println("1-" + sayi + " Arasındaki Asal Sayılar:");
        for (int i = 0; i < elemanSayisi ; i++) {
            System.out.print("{" + sayıDizisi[i] + "} ");
        }
        System.out.println("\n");
    } 
    
    static int[] silSayi(int[] dizi ,int index , int elemanSayisi) {
        for (int i = index; i < elemanSayisi-1; i++) {
            dizi[i] = dizi[i+1] ;
        }
        return dizi ;
    }
}



