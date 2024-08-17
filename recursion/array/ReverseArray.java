package recursion.array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {5,4,3,2,1};
        reverse(arr,0,arr.length-1);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void reverse (int arr[], int si, int ei){

        if(si<=ei){
           int temp = arr[si];
           arr[si] = arr[ei];
           arr[ei] = temp;
           reverse(arr, si+1, ei-1);
        }

    }
}
