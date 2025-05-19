import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10'luk tabandaki sayıyı girin: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String result = decimalToBinary(decimalNumber) ;
        System.out.println("result: " + result);
    }

    static String decimalToBinary(int sayi) {
        if (sayi == 2)
            return  "10" ;
        else if (sayi == 1)
            return "1" ;
        return decimalToBinary(sayi/2) + sayi%2  ;
    }
}

