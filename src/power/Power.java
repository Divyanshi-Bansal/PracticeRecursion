package power;

public class Power {
    public static int PowerOfNumber(int x,int n) {
        if (n==1){
            return x;
        }
        if (n==0){
            return 1;
        }//any of the if condition is satisfy ,its return value goes to its call in  base condition
        return x*PowerOfNumber(x,n-1);//base condition
    }
}
