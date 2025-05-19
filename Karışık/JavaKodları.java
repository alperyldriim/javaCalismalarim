import java.util.Scanner;

public class JavaKodları {

    public static void main(String[] args) {
        // Toplama İşlemi:
        // int a, b;
        // Scanner input = new Scanner(System.in);
        // System.out.println("1.Değeri Giriniz: ");
        // a = input.nextInt();
        // System.out.println("2.Değeri Giriniz: ");
        // b = input.nextInt();
        // System.out.println("a + b = " + (a + b));

        // Not Ortalaması Hesaplama:
        // int vize, quiz, ffinal;
        // double ortalama;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Vize Notunuzu Giriniz: ");
        // vize = sc.nextInt();
        // System.out.println("Quiz Notunuzu Giriniz: ");
        // quiz = sc.nextInt();
        // System.out.println("Final Notunuzu Giriniz: ");
        // ffinal = sc.nextInt();
        // ortalama = (vize * 0.2) + (quiz * 0.4) + (ffinal * 0.4);
        // System.out.println("Ortalama: " + ortalama);
        // String sonuc = (ortalama >= 50) ? "Geçtiniz" : "Kaldınız";
        // System.out.println(sonuc);

        // for (int i = 0; i < 10; i++) {
        //     int sayi = (int) (Math.random()*100) +1 ;
        //     System.out.print(sayi + " ");
        // }

        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         if (j == 5) 
        //             break;
        //     }
        //     System.out.println(i);
        // }

        // KDV Hesaplama Programı:
        // double kdv = 0.18, toplamUcret, ucret;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Toplam Ücret Fiyatını Giriniz: ");
        // toplamUcret = sc.nextDouble();
        // ucret = toplamUcret - (toplamUcret * kdv);
        // System.out.println("KDV'siz Fiyatı: " + ucret);

        // Dairenin Çevresi ve Alanı:
        // int r;
        // float pi = 3.14f, cevre, alan;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Dairenin Yarıçapını Giriniz: ");
        // r = sc.nextInt();
        // cevre = 2 * pi * r;
        // alan = pi * r * r;
        // System.out.println("Dairenin Çevresi : " + cevre);
        // System.out.println("Dairenin Alanı : " + alan);

        // Switch Komutu:
        // int sayi;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Sayı Giriniz: ");
        // sayi = sc.nextInt();
        // switch (sayi) {
        // case 1:
        // System.out.println("Sayı 1'e Eşit");
        // break;
        // case 2:
        // System.out.println("Sayı 2'ye Eşit");
        // break;
        // case 3:
        // System.out.println("Sayı 3'e Eşit");
        // break;
        // }

        // İf ve Else Komutları:
        // int a = 60;
        // int b = 60;
        // int c = 60;
        // if ((a == b) && (a == c)) {
        // System.out.println("Tüm Sayılar Eşit");
        // } else if ((b == a) && (b > c)) {
        // System.out.println("A ve B Sayısı Eşit ve En Büyük Sayılardır.");
        // } else if ((b == a) && (c > b)) {
        // System.out.println("C Sayısı En Büyük A ve B Sayıları Eşit Sayılardır.");
        // } else if ((c == a) && (c > b)) {
        // System.out.println("A ve C Sayısı Eşit ve En Büyük Sayılardır.");
        // } else if ((c == a) && (b > c)) {
        // System.out.println("B Sayısı En Büyük A ve C Sayıları Eşit Sayılardır.");
        // } else if ((c == b) && (c > a)) {
        // System.out.println("B ve C Sayısı Eşit ve En Büyük Sayılardır.");
        // } else if ((c == b) && (a > c)) {
        // System.out.println("A Sayısı En Büyük B ve C Sayıları Eşit Sayılardır.");
        // } else if (((c > a) && (c > b)) && (a != b)) {
        // System.out.println("C Sayısı En Büyük Sayıdır.");
        // } else if (((a > b) && (a > c)) && (c != b)) {
        // System.out.println("A Sayısı En Büyük Sayıdır.");
        // } else if (((b > a) && (b > c)) && (a != c)) {
        // System.out.println("B Sayısı En Büyük Sayıdır.");
        // }

        // Hesap Makinesi Programı:
        // int islem;
        // float a , b;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("1.Değeri Giriniz: ");
        // a = sc.nextFloat();
        // System.out.println("2.Değeri Giriniz: ");
        // b = sc.nextFloat();
        // System.out.println(
        // "Yapacağınız İşlemi Seçiniz: \n1.İşlem : Toplama\n2.İşlem : Çıkartma\n3.İşlem
        // : Çarpma\n4.İşlem : Bölme");
        // islem = sc.nextInt();
        // if (islem == 1) {
        // System.out.println("a + b = " + (a + b));
        // } else if (islem == 2) {
        // System.out.println("a - b = " + (a - b));
        // } else if (islem == 3) {
        // System.out.println("a * b = " + (a * b));
        // } else if (islem == 4) {
        // System.out.println("a / b = " + (a / b));
        // } else {
        // System.out.println("Hatalı İşlem!!");
        // }

        // Kullanıcı Girişi Programı:
        // String fkullaniciAdi, fparola;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Kullanıcı Adınızı Giriniz: ");
        // fkullaniciAdi = sc.nextLine();
        // System.out.println("Parolanızı Giriniz: ");
        // fparola = sc.nextLine();
        // String kullaniciAdi = "alper.yildriim";
        // String parola = "123456";
        // if (fkullaniciAdi.equals(kullaniciAdi)) {
        // if (fparola.equals(parola)) {
        // System.out.println("Giriş Başarılı");
        // } else {
        // System.out.println("Parola Yanlış!");
        // }
        // } else if (fparola.equals(parola)) {
        // System.out.println("Kullanıcı Adı Yanlış!");
        // } else {
        // System.out.println("Kullanıcı Adı ve Parola Yanlış!");
        // }

        // Not Ortalaması Hesaplama:
        // int mat, fen, turkce, sos, beden;
        // float ortalama;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Matematik Dersinin Notunu Giriniz: ");
        // mat = sc.nextInt();
        // System.out.println("Fen Bilgisi Dersinin Notunu Giriniz: ");
        // fen = sc.nextInt();
        // System.out.println("Türkçe Dersinin Notunu Giriniz: ");
        // turkce = sc.nextInt();
        // System.out.println("Sosyal Bilgisi Dersinin Notunu Giriniz: ");
        // sos = sc.nextInt();
        // System.out.println("Beden Eğitimi Dersinin Notunu Giriniz: ");
        // beden = sc.nextInt();
        // ortalama = (mat + fen + turkce + sos + beden) / 5;
        // System.out.println("Ortalamanız: " + ortalama);
        // if ((mat < 45) || (turkce < 55) || (fen < 45) || (beden < 45) || (sos < 45)
        // || (ortalama < 70)) {
        // System.out.println("Hiçbir Belge Kazanamadınız.");
        // } else if ((ortalama >= 70) && (ortalama < 85)) {
        // System.out.println("Teşekkür Belgesi Kazandınız.");
        // } else {
        // System.out.println("Takdir Belgesi Kazandınız.");
        // }

        // Uçak Bileti Fiyatı:
        // int yas, km, tip;
        // double toplamucret, ucret, sonucret;
        // String isim;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("İsminizi Giriniz: ");
        // isim = sc.nextLine();
        // System.out.println("Yaşınızı Giriniz: ");
        // yas = sc.nextInt();
        // System.out.println("Mesafeyi Giriniz: ");
        // km = sc.nextInt();
        // System.out.println("Yolculuğun Tipini Belirleyin (1 = Tek Gidiş , 2 =
        // Gidiş/Dönüş): ");
        // tip = sc.nextInt();
        // toplamucret = km * 0.10 * tip;
        // if ((yas > 0) && (km > 0) && ((tip == 1) || (tip == 2))) {
        // System.out.println("Girdiler Doğru");
        // if (yas < 12) {
        // ucret = toplamucret * 0.5;
        // } else if ((yas < 24) && (yas > 12)) {
        // ucret = toplamucret * 0.9;
        // } else if (yas > 65) {
        // ucret = toplamucret * 0.7;
        // } else {
        // ucret = toplamucret;
        // }
        // if (tip == 2) {
        // sonucret = ucret * 0.8;
        // } else {
        // sonucret = ucret;
        // }
        // System.out.println(isim + " Toplam Ücretiniz: " + sonucret + "$");
        // } else {
        // System.out.println("Girdiler Yanlış!");
        // }

        // Etkinlik Öneren Program:
        // int hava;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Hava Sıcaklığını Giriniz: ");
        // hava = sc.nextInt();
        // if (hava >= 30) {
        // System.out.println("Yüzmeye git.");
        // } else if ((hava < 30) && (hava > 4)) {
        // System.out.println("Sinemaya git.");
        // } else {
        // System.out.println("Kayak Yap.");
        // }

        // Sayıları Sıralayan Program:
        // int a, b, c;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("A Değerini Giriniz: ");
        // a = sc.nextInt();
        // System.out.print("B Değerini Giriniz: ");
        // b = sc.nextInt();
        // System.out.print("C Değerini Giriniz: ");
        // c = sc.nextInt();
        // System.out.println("A Değeri: " + a + "\nB Değeri: " + b + "\nC Değeri: " +
        // c);
        // if ((a == b) && (a == c)) {
        // System.out.println("A = B = C");
        // } else if ((a > b) && (a > c) && (b == c)) {
        // System.out.println("A > B = C");
        // } else if ((b > c) && (b > a) && (a == c)) {
        // System.out.println("B > A = C");
        // } else if ((c > b) && (c > a) && (b == a)) {
        // System.out.println("C > A = B");
        // } else if ((a > c) && (b == a)) {
        // System.out.println("A = B > C");
        // } else if ((a > b) && (a == c)) {
        // System.out.println("A = C > B");
        // } else if ((a > c) && (b == a)) {
        // System.out.println("B = C > A");
        // } else if ((a > b) && (a > c)) {
        // if (b > c) {
        // System.out.println("A > B > C");
        // } else {
        // System.out.println("A > C > B");
        // }
        // } else if ((b > a) && (b > c)) {
        // if (a > c) {
        // System.out.println("B > A > C");
        // } else {
        // System.out.println("B > C > A");
        // }
        // } else if ((c > b) && (c > a)) {
        // if (a > b) {
        // System.out.println("C > A > B");
        // } else {
        // System.out.println("C > B > A");
        // }
        // } else {
        // System.out.println("Hatalı İşlem");
        // }

        // 1'den 100'e Kadar Çarpma İşlemi:
        // for (int i = 1; i <= 10; i++) {
        // for (int k = 1; k <= 10; k++) {
        // System.out.println("i * k = " + i + " * " + k + " = " + (i * k));
        // }
        // }

        // Girilen Değerlerin Ebobunu Bulma:
        // int a, b, ebob;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("1.Değeri Giriniz: ");
        // a = sc.nextInt();
        // System.out.println("2.Değeri Giriniz: ");
        // b = sc.nextInt();
        // if (a >= b) {
        // ebob = b;
        // } else {
        // ebob = a;
        // }
        // while (((a % ebob != 0) && (b % ebob != 0)) || ((a % ebob == 0) && (b % ebob!= 0))
        // || ((a % ebob != 0) && (b % ebob == 0))) {
        // ebob--;
        // }
        // System.out.println("Girilen " + a + " ve " + b + " Değerinin Ebobu: " +
        // ebob);

        // Girilen Değerlerin Ekokunu Bulma:
        // int a, b, ekok;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("1.Değeri Giriniz: ");
        // a = sc.nextInt();
        // System.out.println("2.Değeri Giriniz: ");
        // b = sc.nextInt();
        // if (a >= b) {
        // ekok = a;
        // } else {
        // ekok = b;
        // }
        // while (((ekok % a == 0) && (ekok % b != 0)) || ((ekok % a != 0) && (ekok % b
        // == 0))
        // || ((ekok % a != 0) && (ekok % b != 0))) {
        // ekok++;
        // }
        // System.out.println("Girilen " + a + " ve " + b + " Değerinin Ekoku: " +
        // ekok);

        // int birincisayi, ikincisayi, ebob, ekok, kucuksayi;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Birinci Sayıyı Gir: ");
        // birincisayi = sc.nextInt();
        // System.out.println("İkinci Sayıyı Gir: ");
        // ikincisayi = sc.nextInt();
        // if (birincisayi >= ikincisayi) {
        // kucuksayi = ikincisayi;
        // } else {
        // kucuksayi = birincisayi;
        // }
        // while (((birincisayi % kucuksayi == 0) && (ikincisayi % kucuksayi != 0))
        // || ((birincisayi % kucuksayi != 0) && (ikincisayi % kucuksayi == 0))
        // || ((birincisayi % kucuksayi != 0) && (ikincisayi % kucuksayi != 0))) {
        // kucuksayi--;
        // }
        // ebob = kucuksayi;
        // ekok = (birincisayi * ikincisayi) / ebob;
        // System.out.println(
        // "Girilen " + birincisayi + " ve " + ikincisayi + " Değerlerinin \nEbobu: " +
        // ebob + "\nEkoku: " + ekok);

        // Girilen Değerin Faktoriyelini Bulma:
        // int a, faktoriyel;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Sayıyı Girin: ");
        // a = sc.nextInt();
        // faktoriyel = 1;
        // if ((a == 0) || (a == 1)) {
        // System.out.println("Girdiğiniz " + a + " Değerinin Faktoriyeli: " +
        // faktoriyel);
        // } else {
        // for (int i = 2; i <= a; i++) {
        // faktoriyel = faktoriyel * i;
        // }
        // System.out.println("Girdiğiniz " + a + " Değerinin Faktoriyeli: " +
        // faktoriyel);
        // }

        // 1'den 100'e Kadar Olan Çift Sayılar:
        // int a = 1;
        // while (a <= 100) {
        // if (a % 2 == 0) {
        // System.out.println(a);
        // }
        // a++;
        // }

        // Girilen Tek Sayıların Toplamı:
        // int a, toplam;
        // Scanner sc = new Scanner(System.in);
        // toplam = 0;
        // while (true) {
        // System.out.println("Bir Değer Girin: ");
        // a = sc.nextInt();
        // if (a < 0) {
        // System.out.println("Döngüden Çıkılıyor");
        // break;
        // } else {
        // if (a % 2 != 0) {
        // toplam += a;
        // }
        // }
        // }
        // System.out.println("Girilen Tek Sayıların Toplamı: " + toplam);

        // Girilen Sayıya Kadar Olan 2'nin Kuvvetleri:
        // int a, k, i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // k = 1;
        // i = 0;
        // while (k <= a) {
        // System.out.println("2 Üssü " + i + " = " + k);
        // k = k * 2;
        // i++;
        // }

        // While Döngüsüyle Faktoriyel Hesaplama:
        // int faktoriyel, a, i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // i = 1;
        // faktoriyel = 1;
        // while (i <= a) {
        // faktoriyel *= i;
        // i++;
        // }
        // System.out.println("Girilen " + a + " Değerin Faktoriyeli: " + faktoriyel);

        // Girilen Değerin Hormoniğini Bulma:
        // int a, x;
        // double toplam, i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // i = 1;
        // x = 1;
        // toplam = 0;
        // while (i <= a) {
        // toplam += (1 / i);
        // i++;
        // System.out.println("Girilen " + x + " Değerinin Harmoniği: " + toplam);
        // x++;
        // }

        // Girilen Değer İle Üçgen Yapma:
        // int a, i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // System.out.println();
        // i = 1;
        // while (i <= a) {
        // int k = 1;
        // while (k <= i) {
        // System.out.print("*");
        // k++;
        // }
        // System.out.println();
        // i++;
        // }
        // System.out.println();

        // Girilen 2 Değerin Üssünü Bulma:
        // int a, b, i, uslu;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // System.out.println("Değerin Kaçıncı Üssü Giriniz: ");
        // b = sc.nextInt();
        // uslu = 1;
        // i = 1;
        // while (i <= b) {
        // uslu *= a;
        // i++;
        // }
        // System.out.println(a + " Değerinin " + b + ".Üssü: " + uslu);

        // Girilen Pozitif Çift Değerlerin Toplamı:
        // int a, t;
        // Scanner sc = new Scanner(System.in);
        // t = 0;
        // do {
        // System.out.println("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // if (a % 2 == 0) {
        // t += a;
        // }
        // } while (a >= 0);
        // System.out.println("Girilen Pozitif Çift Değerlerin Toplamı: " + t);

        // Armstrong Sayıları Bulan Program:
        // int a, i, bir, on, yuz, bol;
        // System.out.println("Üç Basamaklı Armstrong Sayılar:");
        // for (i = 100; i <= 999; i++) {
        // a = i;
        // bir = a % 10;
        // bol = a / 10;
        // on = bol % 10;
        // yuz = bol / 10;
        // if ((bir * bir * bir + on * on * on + yuz * yuz * yuz) == a) {
        // System.out.println(a);
        // }
        // }

        // Girilen Değerin Fibonacci Dizisi:
        // int a, b, toplam, input;
        // a = 0;
        // b = 1;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Bir Değer Giriniz: ");
        // input = sc.nextInt();
        // System.out.println(input + " Sayısının Fibonacci Dizisi: ");
        // for (int i = 1; i <= input; i++) {
        // System.out.println(a);
        // toplam = a + b;
        // a = b;
        // b = toplam;
        // }

        // Girilen Değerlerin Ebobu ve Ekokunu Bulma:
        // int s1, s2, min, i, ebob, ekok;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Birinci Değeri Gir: ");
        // s1 = sc.nextInt();
        // System.out.print("İkinci Değeri Gir: ");
        // s2 = sc.nextInt();
        // min = (s1 < s2) ? s1 : s2;
        // for (i = min; i > 0; i--) {
            // if ((s1 % i == 0) && (s2 % i == 0)) {
                // break;
            // }
        // }
        // ebob = i;
        // ekok = (s1 * s2) / ebob;
        // System.out.println("Girilen " + s1 + " ve " + s2 + " Değerlerin \nEbobu: " + ebob + "\nEkoku: " + ekok);

        // 1-50 Arasındaki Toplama ve Çarpma:
        // int tekcarpim = 1 , çiftcarpim = 1 , tektoplam = 0 , cifttoplam = 0 , i = 1 ;
        // while (i < 23) {
            // if (i % 2 == 0) {
                // cifttoplam += i ;
                // çiftcarpim *= i ;
            // } else {
                // tektoplam += i ;
                // tekcarpim *= i ;
            // }
            // i++;
        // }
        // System.out.println("1-20 Sayıları Arasındaki \nTek Sayıların Toplamı: " + tektoplam + "\nTek Sayıların Çarpımı: " + tekcarpim + "\nÇift Sayıların Toplamı: " + cifttoplam + "\nÇift Sayıların Çarpımı: " + çiftcarpim);

        // Girilen Değerler Dost Sayılar Mı?
        // int i = 1 , a = 1 , top1 = 0 , top2 = 0 , sayi1 , sayi2 ;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("1.Sayıyı Girin: ");
        // sayi1 = sc.nextInt();
        // System.out.print("2.Sayıyı Girin: ");
        // sayi2 = sc.nextInt();
        // while (i < sayi1) {
            // if (sayi1 % i == 0) {
                // top1 += i ;
            // }
            // i++ ;
        // }
        // while (a < sayi2) {
            // if (sayi2 % a == 0) {
                // top2 += a ;
            // }
            // a++ ;
        // }
        // if ((top1 == sayi2) && (top2 == sayi1)) {
            // System.out.println(sayi1 + " ve " + sayi2 + " Dost Sayılar");
        // } else {
            // System.out.println(sayi1 + " ve " + sayi2 + " Dost Sayı Değiller");
        // }

        // Girilen Değerlerin Küpleri Toplamı:
        // int sayac = 1 , sayi , kuptop = 0;
        // Scanner sc = new Scanner(System.in) ;
        // while (sayac <= 15) {
            // System.out.print(sayac + ".Sayıyı Girin: ");
            // sayi = sc.nextInt();
            // kuptop += sayi*sayi*sayi ;
            // sayac++ ;
        // }
        // System.out.println("Girilen Değerlerin Küpleri Toplamı: " + kuptop);

        // Girilen Değerin Basamak Sayısını Bulma: 
        // int sayi , basamak = 0 , kalan;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Sayı Gİriniz: ");
        // sayi = sc.nextInt() ;
        // while (sayi > 0) {
            // kalan = sayi % 10 ;
            // basamak++ ;
            // sayi -= kalan ;
            // sayi /= 10 ;
        // }
        // System.out.println("Sayı " + basamak + " Basamaklı");

        // Girilen Değer Palidrom Mu?:
        // int sayi1 , sayi2 , ters = 0 , kalan ;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Bir Sayı Girin: ");
        // sayi1 = sc.nextInt();
        // sayi2 = sayi1 ;
        // while (sayi2 > 0) {
        //     kalan = sayi2 % 10 ;
        //     ters *= 10 ;
        //     ters += kalan ;
        //     sayi2 -= kalan ;
        //     sayi2 /= 10 ;
        // }
        // if (ters == sayi1) {
        //     System.out.println("Girilen Sayı Palidrom Sayı");
        // } else {
        //     System.out.println("Girilen Sayı Palidrom Sayı Değil");
        // }

        // Uygulama 4: 
        // int sayac = 0 , sayi , faktoriyel = 1 , i , N;
        // double top = 0.0 ;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Bir Değer Giriniz: ");
        // sayi = sc.nextInt() ;
        // System.out.print("Seri Sayısını Giriniz: ");
        // N = sc.nextInt() ;
        // while (sayac <= N) {
            // i = sayac ;
            // if (sayac == 0 || sayac == 1) {
                // faktoriyel = 1 ;
            // } else {
                // while (i >= 1) {
                    // faktoriyel *= i ;
                    // i-- ;
                // }
                // System.out.println(faktoriyel);
            // }
            // top += (Math.pow(sayi, sayac)) / faktoriyel ;
            // faktoriyel = 1 ;
            // sayac++ ;
        // }
        // System.out.println("Sayı: " + sayi + "\nSonuç: " + top);

        // Fonksiyon(N/(N+1)) Programı:
        // int x , topla = 1;
        // double top = 0 , sayac = 1;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Bir Değer Giriniz: ");
        // x = sc.nextInt() ;
        // while (sayac <= x) {
            // top = top + sayac / (sayac + topla) ;
            // sayac++ ;
        // }
        // System.out.println("Sonuç: " + top);

        // Girilen Değer Aralıktaki Pozitif Sayılar Toplamı ve Adedi:
        // int sayi1 , sayi2 , kalan , sayac = 2 , top = 0 , adet = 0;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Büyük Sayıyı Girin: ");
        // sayi1 = sc.nextInt();
        // System.out.print("Küçük Sayıyı Girin: ");
        // sayi2 = sc.nextInt();
        // kalan = sayi1 - sayi2 ;
        // if (kalan < 0) {
            // System.out.println("Hatalı İşlem!");
        // } else if (kalan == 0 || kalan == 1) {
            // System.out.println("Girilen Değer Aralıktaki Pozitif Sayılar \nToplamı: 0\nSayı Adedi: 0");
        // } else {
            // while (sayac <= kalan) {
                // top += sayi2+1 ;
                // adet++ ;
                // sayi2++;
                // sayac++;
            // }
            // System.out.println("Girilen Değer Aralıktaki Pozitif Sayılar \nToplamı: " + top + "\nSayı Adedi: " + adet);
        // }

        // Faktoriyon Sayı Bulma:
        // int faktoriyel = 1 , top = 0 , sayi , kalan , sayi2 , kalan2;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Bir Değer girin: ");
        // sayi = sc.nextInt();
        // sayi2 = sayi ;
        // while (sayi2 != 0) {
            // kalan = sayi2 % 10 ;
            // kalan2 = kalan ;
            // if (kalan2 == 0 || kalan2 == 1) {
                // faktoriyel = 1 ;
            // } else {
                // while (kalan2 != 0) {
                //    faktoriyel *= kalan2 ;
                //    kalan2--;
            // }
            // }
            // top += faktoriyel ;
            // faktoriyel = 1 ;
            // sayi2 -= kalan ;
            // sayi2 /= 10 ;
        // }
        // if (top == sayi) {
            // System.out.println(sayi + " Sayısı Faktoriyon Sayı");
        // } else {
            // System.out.println(sayi + " Sayısı Faktoriyon Sayı Değil");
        // }

        // Denklemin kökünü Bulma:
        // int a , b , c , delta;
        // double x1 , x2 , x3;
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("A Değerini girin: ");
        // a = sc.nextInt() ;
        // System.out.print("B Değerini girin: ");
        // b = sc.nextInt() ;
        // System.out.print("C Değerini girin: ");
        // c = sc.nextInt() ;
        // delta = (b * b) - (4 * a * c) ;
        // if (delta > 0) {
            // x1 = (-b -Math.pow(delta,1/2)) / (2 * a) ;
            // x2 = (-b +Math.pow(delta,1/2)) / (2 * a) ;
            // System.out.println("Girilen Denklemin Kökleri \n1.Kök: " + x1 + "\n2.Kökü: " + x2);
        // } else if (delta == 0) {
            // x3 = -b / (2 * a) ;
            // System.out.println("Girilen Denklemin \nKökü: " + x3);
        // } else {
            // System.out.println("Denklemin Kökü Karmaşık Sayıdır");
        // }

        // Girilen Büyük Değer Tek Mi , Çift Mi:
        // int a , b ;
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("1.Değeri girin: ");
        // a = sc.nextInt() ;
        // System.out.print("2.Değeri girin: ");
        // b = sc.nextInt() ;
        // if (a >= b) {
            // if (a % 2 == 0) {
                // System.out.println("Girilen Büyük Değer Çift");
            // } else {
                // System.out.println("Girilen Büyük Değer Tek");
            // }
        // } else {
            // if (b % 2 == 0) {
                // System.out.println("Girilen Büyük Değer Çift");
            // } else {
                // System.out.println("Girilen Büyük Değer Tek");
            // }
        // }

        // Ailedeki Yaş ortalaması:
        // int birey , yas , topyas = 0 , sayac = 1;
        // double ortyas ;
        // Scanner sc = new Scanner(System.in) ;
        // System.out.print("Ailedeki birey Sayısını Girin: ");
        // birey = sc.nextInt();
        // while (sayac <= birey) {
            // System.out.print("Ailenizdeki " + sayac + ".Kişinin Yaşını Girin: ");
            // yas = sc.nextInt();
            // topyas += yas ;
            // sayac++;
        // }
        // ortyas = topyas / birey ;
        // System.out.println("Ailenizdeki Toplam Birey: " + birey + "\nYaş Toplamı: " + topyas + "\nYaş Ortalaması: " + ortyas);

        // Girilen Değer Asal Mı?:
        // int a , sayac , b;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Bir Değer Giriniz: ");
        // a = sc.nextInt();
        // sayac = a - 1 ;
        // b = 0;
        // while (sayac != 1) {
            // if (a % sayac == 0) {
                // System.out.println("Girilen Sayı Asal Değil");
                // b = 1;
                // break;
            // }
            // sayac--;
        // }
        // if (b != 1) {
            // System.out.println("Girilen Sayı Asal");
        // }

        // 1-200 Sayıları Arasındaki Asal Sayılar:
        // System.out.println("1-200 Sayıları Arasındaki Asal Sayılar:");
        // System.out.print(2);
        // int a = 0 ;
        // for (int sayi = 3 ; sayi < 200 ; sayi++) {
            // for (int bolen = 2 ; bolen < sayi ; bolen++) {
                // if (sayi % bolen == 0) {
                    // a = 1;
                // }
            // }
            // if (a == 0) {
                // System.out.print(" - " + sayi);
            // }
            // a = 0;
        // }

        // 20-200 Sayıları Arasındaki Asal Sayılar:
        // System.out.println("20-200 Sayıları Arasındaki Asal Sayılar:");
        // for (int sayi = 20 ; sayi < 200 ; sayi++) {
        //     for (int bolen = 2 ; bolen <= sayi ; bolen++) {
        //         if (sayi == bolen) {
        //             System.out.println(sayi);
        //         } else if (sayi % bolen == 0) {
        //             break;
        //         }
        //     }
        // }

        // Cullen Sayı mı?:
        // double sayi;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Bir Değer Giriniz: ");
        // sayi = sc.nextInt();
        // for (int sayac = 1 ; sayac <= sayi ; sayac++) {
            // double islem = Math.pow(2, sayac) * sayac + 1 ;
            // if (islem == sayi) {
                // System.out.println("Cullen Sayı");
                // break;
            // } else if (islem > sayi) {
                // System.out.println("Cullen Sayı Değil");
                // break;
            // }
        // }

        // Bağdaşık Sayı mı?:
        // int sayi1 , sayi2 ,sayibir1 , sayibir2 , sayion1 , sayion2;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("1.Sayıyı Girin: ");
        // sayi1 = sc.nextInt();
        // System.out.print("2.Sayıyı Girin: ");
        // sayi2 = sc.nextInt();
        // while (sayi1 < 10 || sayi1 > 99) {
            // System.out.print("1.Sayıyı Tekrar Girin: ");
            // sayi1 = sc.nextInt();
        // } 
        // while (sayi2 < 10 || sayi2 > 99) {
            // System.out.print("2.Sayıyı Tekrar Girin: ");
            // sayi2 = sc.nextInt();
        // } 
        // sayibir1 = sayi1 % 10 ;
        // sayibir2 = sayi2 % 10 ;
        // sayion1 = sayi1 - sayibir1 ;
        // sayion2 = sayi2 - sayibir2 ;
        // if ((sayibir1 + sayibir2) == 10 && sayion1 == sayion2) {
            // System.out.println("Bağdaşık Sayı");
        // } else {
            // System.out.println("Bağdaşık Sayı Değil");
        // }

        // Tau Sayı mı?:
        // int sayi , bolen = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Bir Değer Giriniz: ");
        // sayi = sc.nextInt();
        // for (int i = 1 ; i <= sayi ; i++) {
            // if (sayi % i == 0) {
                // bolen++;
            // }
        // }
        // if (sayi % bolen == 0) {
            // System.out.println("Tau Sayı");
        // } else {
            // System.out.println("Tau Sayı Değil");
        // }

    }
}
