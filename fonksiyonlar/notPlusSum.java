import java.util.Scanner;

public class notPlusSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ") ;
        int sayi1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz : ") ;
        int sayi2 = sc.nextInt();
        sc.close();

        sumNotPlus(sayi1 , sayi2) ;

    }

    static int decimalToBinary(int sayi) {
        if (sayi == 2)
            return 10 ;
        else if (sayi == 1)
            return 1 ;
        return decimalToBinary(sayi/2) * 10 + sayi%2  ;
    }

    static int compare0and1(int sayi1, int sayi2) {
        if (sayi1%10 == sayi2%10)
            return 0 ;
        return 1 ;
    }

    static boolean isCount(int sayi1, int sayi2) {
        return sayi1%10 == 1 && sayi2%10 == 1 ;
    }

    static int addWithLogic (int sayi1 , int sayi2,boolean c) {
        if (sayi1 == 0 && sayi2 == 0 && c)
            return 1;
        else if (sayi1 == 0 && sayi2 == 0)
            return 0 ;
        boolean count = isCount(sayi1, sayi2) ;
        int add = compare0and1(sayi1 , sayi2) ;
        if (c && count)
            add = compare0and1(add, 1) ;
        else if (c) {
            count = isCount(add, 1) ;
            add = compare0and1(add, 1) ;
        }
        return add + 10 * addWithLogic(sayi1/10, sayi2/10, count) ;
    }

    static int binaryToDecimal(int sayi , int count) {
        if (sayi == 1) 
            return (int) Math.pow(2, count);
        else if (sayi == 0)
            return 0 ;
        if (sayi%10 == 1)
            return (int) Math.pow(2, count) + binaryToDecimal(sayi/10, count+1) ;
        return binaryToDecimal(sayi/10, count+1) ;
    }

    static void sumNotPlus(int sayi1 , int sayi2) {
        int binarySayi1 = decimalToBinary(sayi1) ;
        int binarySayi2 = decimalToBinary(sayi2) ;
        int sum = addWithLogic(binarySayi1, binarySayi2, false) ;
        System.out.println("Binary Sayi1    : " + binarySayi1);
        System.out.println("Binary Sayi2    : " + binarySayi2);
        System.out.println("Binary Toplamı  : " + sum );
        System.out.println("Decimal Toplamı : " + binaryToDecimal(sum, 0));
    }

}