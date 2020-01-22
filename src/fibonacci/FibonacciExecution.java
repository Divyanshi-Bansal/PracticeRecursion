package fibonacci;

import java.util.Scanner;

public class FibonacciExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m= scanner.nextInt();
        int n= scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibo(m,n));
    }
}
