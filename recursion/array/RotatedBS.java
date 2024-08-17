package recursion.array;

public class RotatedBS {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};

        int si = 0;
        int ei = arr.length-1;
        int target = 4;
        System.out.println( rotatedBS(arr,target,si,ei));
    }
    public  static  int rotatedBS(int arr[], int target,int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si +(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(target >= arr[si] && target<=arr[mid]){
                return rotatedBS(arr,target,si,mid-1);
            }
            else {
                return rotatedBS(arr,target,mid+1,ei);
            }

        }
        if(target >= arr[mid] && target <= arr[ei]){
            return rotatedBS(arr,target,mid+1,ei);
        }
        return rotatedBS(arr,target,si,mid-1);
    }
}
