package fibonacci;

public class Fibonacci {
    public static int fibo(int m,int n){
        if(m==n){
            return n;
        }
        return m+fibo(m+1,n);
    }
}
