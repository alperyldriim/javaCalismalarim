public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci: " + fibonacci(25));
        
    }

    static int fibonacci(int a) {
        if ((a == 1) || (a == 2)) {
            return 1;
        }
       return fibonacci(a-1) + fibonacci(a-2);
    }
}
