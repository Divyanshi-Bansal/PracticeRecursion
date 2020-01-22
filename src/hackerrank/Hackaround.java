package hackerrank;

import java.util.Arrays;

public class Hackaround {
    public void Sol(int []arr){
        int l= arr.length;
        int p=l/2;
        for (int i=0;i<p;i++){
            int temp = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
