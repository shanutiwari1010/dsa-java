package recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 10808809;

       count(n);
        System.out.println(ans);
    }
    static  int ans =0 ;
    public static void count(int n){
        if(n == 0){
            return;
        }

        int rem = n%10;
        if(rem ==0 ){
            ans = ans+1;
        }
        count(n/10);
    }
}
