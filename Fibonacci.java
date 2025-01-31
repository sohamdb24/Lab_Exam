public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of Fibonacci numbers to print
        long[] fib = new long[n];

        fib[0] = 0;
        fib[1] = 1;

        System.out.println("First " + n + " Fibonacci numbers:");
        System.out.print(fib[0] + " " + fib[1] + " ");

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
    }
}