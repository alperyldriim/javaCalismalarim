public class RekursifSorulari {
    static int toplam=0;

    public static void main(String[] args) {
        // System.out.println(rekursifToplam(5));
        // System.out.println(rekursifFaktor(5));
        // System.out.println(aralikToplam(5,8));
        // System.out.println(rekursifUst(2,5));
        // rekursifHello(5);
        // rekursifNYazdirma(5);
        // rekursifNCiftYazdirma(100);
        // System.out.println(rekursifCiftToplam(10));
        akifMethod(10);
        System.out.println(toplam);

    }
    // 1'den n'e kadar olan sayıların toplamının rekürsif metodu
    static int rekursifToplam(int n){
        // Base statement: Temel durum
        if(n==1)
            return 1;
        // recursive statement: Yineleme durumu
        else
            return n + rekursifToplam(n-1);
    }

    // n! işlemini rekursif olarak yapan metot
    static int rekursifFaktor(int n){
        if(n==1)
            return 1;
        else
            return n * rekursifFaktor(n-1);
    }

    // Belirtilen aralıktaki degerlerin toplamını dönderen,
    // rekursif metot
    static int aralikToplam(int alt, int ust){
        if(alt==ust)
            return alt;
        else
            return ust + aralikToplam(alt, ust-1);
    }

    // Pow metodunun rekürsif yazılması
    static int rekursifUst(int taban, int ust){
        if(ust==1)
            return taban;
        else
            return taban * rekursifUst(taban, ust-1) ;
    }

    // n tane hello yazan rekursif metot
    static void rekursifHello(int n){
        if(n!=0){
            System.out.println("Hello");
            rekursifHello(n-1);
        }
    }

    // 1'den n'e kadar olan sayıların ekrana yazdırılması rekürsif
    static void rekursifNYazdirma(int n){
        if (n!=0){
            rekursifNYazdirma(n-1);
            System.out.print(n + " ");
        }
    }

    // 1'den n'e kadar olan çift sayıların ekrana yazıdırılması
    static void rekursifNCiftYazdirma(int n){
        if (n!=0){
            rekursifNCiftYazdirma(n-1);
            if(n%2==0)
            System.out.print(n + " ");
        }
    }

    // 1'den n'e kadar olan çift sayıların toplamını bulan
    // rekursif metot
    static int rekursifCiftToplam(int n){
        if(n==0)
            return 0;
        else if (n%2==1)
            return rekursifCiftToplam(n-1);
        else
            return n + rekursifCiftToplam(n-2);
    }

    static void akifMethod(int n){
        if(n!=0)
            akifMethod(n-1);
        if(n%2==0)
            toplam+=n;
    }


}
