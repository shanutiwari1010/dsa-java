package sorting;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int i =0 ;
        int number =0;
        while(i<nums.length){
            int correct =nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int idx =0 ; idx<nums.length ; idx++){
            if(nums[idx] != idx){
                return idx;
            }
        }

        return nums.length;
    }
    void swap(int arr[], int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
