package power;

import java.util.Scanner;

public class PowerExecuion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int n=scanner.nextInt();
        Power power = new Power();
        System.out.println(power.PowerOfNumber(x,n));
    }
}
