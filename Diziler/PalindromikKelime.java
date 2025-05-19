import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        String kelime , tersKelime = "";
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Bir Kelime giriniz: ");
        kelime = sc.nextLine();
        for (int i = kelime.length() -1 ; i >= 0 ; i--){
            tersKelime += kelime.charAt(i) ;
        }
        if (tersKelime.equalsIgnoreCase(kelime)) {
            System.out.println("Girilen " + kelime + " Kelimesi Palindromik Kelime");
        } else {
            System.out.println("Girilen " + kelime + " Kelimesi Palindromik Kelime Değil");
        }

    }
}
