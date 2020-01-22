package factorial;

import java.util.Scanner;

public class FactorialExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Factorial factorial= new Factorial();
        System.out.println(factorial.fact(n));
    }
}
