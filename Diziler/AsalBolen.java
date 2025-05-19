import java.util.Scanner;

public class AsalBolen {
    public static void main(String[] args) {
        int[][] sayiAsalBolen = new int[50][2];
        int[][] sayiAsalBolen2 = new int[50][2];
        int sayi , ksayi, asal = 2 ,asalbolen = 0 , pozitifbolen = 1 , sayi1sayac = 0 , ebob = 1;
        int sayi2 , ksayi2 , asal2 = 2 ,asalbolen2 = 0 , pozitifbolen2 = 1 , sayi2sayac = 0;
        int ekok = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Değeri Giriniz: ");
        sayi = sc.nextInt();
        ksayi = sayi ;
        while (ksayi != 1) {
            while (ksayi % asal == 0) {
                ksayi /= asal ;
                sayiAsalBolen[sayi1sayac][0] = asal;
                asalbolen++;
            }
            sayiAsalBolen[sayi1sayac][1] = asalbolen;
            sayi1sayac++;
            pozitifbolen *= (asalbolen+1) ;
            asalbolen = 0;
            asal++;
        }

        System.out.print("2.Değeri Giriniz: ");
        sayi2 = sc.nextInt();
        ksayi2 = sayi2 ;
        while (ksayi2 != 1) {
            while (ksayi2 % asal2 == 0) {
            ksayi2 /= asal2 ;
            sayiAsalBolen2[sayi2sayac][0] = asal2;
            asalbolen2++;
        }
        sayiAsalBolen2[sayi2sayac][1] = asalbolen2;
        sayi2sayac++;
        pozitifbolen2 *= (asalbolen2+1) ;
        asalbolen2 = 0;
        asal2++;
        }

            for (int i = 0 ; i <= sayi1sayac ; i++) {
                for (int j = 0 ; j <= sayi2sayac ; j++) {
                    if (sayi1sayac >= sayi2sayac) {
                        if (i == j) {
                            if (sayiAsalBolen[i][1] >= sayiAsalBolen2[j][1]) {
                                ebob *= Math.pow(sayiAsalBolen2[j][0], sayiAsalBolen2[j][1]) ;
                                ekok *= Math.pow(sayiAsalBolen[i][0], sayiAsalBolen[i][1]) ;
                            } else {
                                ebob *= Math.pow(sayiAsalBolen[i][0], sayiAsalBolen[i][1]) ;
                                ekok *= Math.pow(sayiAsalBolen2[j][0], sayiAsalBolen2[j][1]) ;
                            }
                        } else if (sayi2sayac == i) {
                            while (i < sayi1sayac) {
                                ekok *= Math.pow(sayiAsalBolen[i][0], sayiAsalBolen[i][1]) ;
                                i++;
                            }                                                       
                        }
                    } else {
                        if (i == j) {
                            if (sayiAsalBolen[i][1] >= sayiAsalBolen2[j][1]) {
                                ebob *= Math.pow(sayiAsalBolen2[j][0], sayiAsalBolen2[j][1]) ;
                                ekok *= Math.pow(sayiAsalBolen[i][0], sayiAsalBolen[i][1]) ;
                            } else {
                                ebob *= Math.pow(sayiAsalBolen[i][0], sayiAsalBolen[i][1]) ;
                                ekok *= Math.pow(sayiAsalBolen2[j][0], sayiAsalBolen2[j][1]) ;
                            }
                        } else if (sayi1sayac == i) {
                            j = sayi1sayac ;
                            while (j < sayi2sayac) {
                                ekok *= Math.pow(sayiAsalBolen2[j][0], sayiAsalBolen2[j][1]) ;
                                j++;
                            }
                        }
                    }                                                                                                                                                                                                                                                                                            
                }
            }
        System.out.println("Girilen " + sayi + " ve " + sayi2 + " Değerlerinin   ");
        System.out.println("Ebobu: " + ebob);
        System.out.println("Ekoku: " + ekok);
        System.out.println("Pozitif Bölenleri Sırasıyla");
        System.out.println(pozitifbolen + " , " + pozitifbolen2);
    }
}

