package recursion.array;

public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5,99};
        System.out.println( isSorted(arr,0));
    }
    public static boolean isSorted(int arr[], int idx){
        if (arr == null || arr.length == 0) {
            return true; // Consider an empty array as sorted
        }
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }

        return isSorted(arr,idx+1);
    }
}
