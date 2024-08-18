package recursion.patterns;

import java.util.Arrays;

public class PrintStart {
    public static void main(String[] args) {
//        triangle(4,0);
        int arr[] ={4,3,2,1};
//        bubbleSort(arr,arr.length-1,0);
        selctionSort(arr,arr.length,0,0);

        System.out.println(Arrays.toString(arr));
    }
    public static  void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }else {
            System.out.println();
            triangle(r-1,0);
        }
    }
    public static  void bubbleSort(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]> arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);
        }else {

            bubbleSort(arr,r-1,0);
        }
    }
    public static  void selctionSort(int arr[], int r,int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selctionSort(arr,r,c+1,c);
            }else {
                selctionSort(arr,r,c+1,max);
            }

        }else {
           int temp = arr[max];
           arr[max] = arr[r-1];
           arr[r-1] = temp;
            selctionSort(arr,r-1,0,0);
        }
    }
}
