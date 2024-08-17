package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;

        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        n = n/10;
        return rem+sum(n);
    }
}
