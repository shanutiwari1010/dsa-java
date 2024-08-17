package searching;

public class InfinitArraySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    public static int ans(int arr[], int target){
        int si =0 ;
        int ei = 1;

        while(target>arr[ei]){
            int temp = ei +1;
            ei = ei + (ei-si)+1;
            si = temp;

        }
        return binarySearch(arr,target,si,ei);
    }
    public static int binarySearch(int arr[], int target, int si, int ei){
        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(target > arr[mid]){
                si = mid+1;
            }else if(target < arr[mid]){
                ei = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
