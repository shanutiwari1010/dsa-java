package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12321;
       reverse(n);
       if(n==sum){
           System.out.println("palindrome");
       }
       else {
           System.out.println("Not palindrome");
       }

    }
    static int sum =0;
    public static void reverse(int n){
        if(n==0){
            return ;
        }


        int rem = n%10;
        sum = sum*10+rem;
        n = n/10;

        reverse(n);

    }
}
