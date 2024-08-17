package recursion;

public class FibonaciiNumber{
    public static void main(String[] args) {
//        System.out.println(fibonacii(7));; ;
        int n =7;

        for(int i=0 ; i<n; i++){
            System.out.print(fibbo(i)+" ");
        }

    }
    static  int fibbo(int n){
        double phi = (1+Math.sqrt(5))/2;
        return (int)Math.round(Math.pow(phi,n)/Math.sqrt(5));
    }
    static int fibonacii(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibo = fibonacii(n-1)+fibonacii(n-2);
//        System.out.println(fibo);
        return fibo ;

    }
}