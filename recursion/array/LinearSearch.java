package recursion.array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,22,33,9,9,9};


        System.out.println(search(arr,9,0));

    }
    public static ArrayList<Integer> search(int arr[],int target, int idx ){
        ArrayList<Integer> list = new ArrayList<>();
        if (arr == null || arr.length == 0 ||idx == arr.length) {
            return list;
        }

        if(target == arr[idx]){
             list.add(idx);

        }
        ArrayList<Integer> ans = search(arr,target,idx+1);
        list.addAll(ans);
       return  list;
    }
}
