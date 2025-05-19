import java.util.Scanner;

public class DiziFonksiyon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Bir Değer Giriniz: ");
        int a = sc.nextInt();
        if (a >= 1) {
            System.out.println("10  8  6  4");
        }
        int[][] tablo = new int[a][4] ;
        for (int i = 1 ; i < a ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                tablo[i][j] = (i + 1) * 10 - ((2+i)*j);
                System.out.print(tablo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
