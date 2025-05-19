public class örnek {
    public static void main(String[] args) {
        int sayi=1001;
        int yeniSayi=0;
        for(int geciciSayi=sayi; geciciSayi>0; geciciSayi=(geciciSayi-geciciSayi%10)/10){
            yeniSayi=yeniSayi*10+(geciciSayi%10);
        }
        if(sayi == yeniSayi){
            System.out.println(sayi + " = " + yeniSayi +" oldugundan bu sayi palindrom sayidir.");
            }
        else{
            System.out.println(sayi + " != " + yeniSayi +" oldugundan bu sayi palindrom sayi degildir.");
        }
    }
}