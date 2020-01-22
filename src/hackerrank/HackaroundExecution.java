package hackerrank;

import java.util.Scanner;

public class HackaroundExecution {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int j=0;j<n;j++){
            int k=sc.nextInt();
            arr[j]=k;
        }
        Hackaround first = new Hackaround();
        first.Sol(arr);
    }
}
