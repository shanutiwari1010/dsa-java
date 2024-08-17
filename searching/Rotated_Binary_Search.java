package searching;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
     int arr[] = {4,5,6,6,7,0,1,2};
//        System.out.println(fimdPivot(arr));
        System.out.println(search(arr,6));
    }

    static int search(int arr[], int target){
        int pivot = fimdPivot(arr);

        if(pivot == -1){
            return  binarySearch(arr,target,0, arr.length-1);
        }

        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<=target){
            return binarySearch(arr,target,0,pivot-1);
        }

            return  binarySearch(arr,target,pivot+1, arr.length-1);

    }

    static  int binarySearch(int arr[], int target, int si , int ei){
        while(si<=ei){
            int mid = si + (ei-si)/2;

            if(arr[mid]>target){
                ei = mid -1;
            }else if(arr[mid]<target){
                si = mid +1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    static  int fimdPivot(int arr[]){
        int si =0;
        int ei = arr.length-1;

        while(si<=ei){
          int mid = si +(ei-si)/2;
          if(mid < ei && arr[mid]>arr[mid+1]){
              return mid;
          }
          if(mid > si && arr[mid]<arr[mid-1]){
                return mid-1;
            }
          if(arr[mid]<= arr[si]){
              ei = mid-1;
          }else{
              si = mid +1;
          }
        }
        return -1;
    }
}
