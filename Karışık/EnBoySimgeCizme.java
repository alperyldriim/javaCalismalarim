import java.util.Scanner;

public class EnBoySimgeCizme {
    public static void main(String[] args) {
        int en , boy ;
        String simge ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Tablonun En Değerini Giriniz: ");
        en = sc.nextInt();
        System.out.print("Tablonun Boy Değerini Giriniz: ");
        boy = sc.nextInt();
        for (int i = 0 ; i < boy ; i++) {
            for (int j = 0; j < en ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
