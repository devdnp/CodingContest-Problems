package _leetcode.binary_search._5;
//#34

import java.util.Arrays;

public class FirstLastPositionElementSortedArray {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int s = 0, l = nums.length-1;
        int[] res = new int[2];
        while(s <= l){
            if(nums[s] == target){
                res[0] = s;
                while(s < l){
                    if(nums[l] == target){
                        res[1] = l;
                        return res;
                    }else{
                        l = l-1;
                    }
                }
                res[1] = s;
                return res;
            }else if(nums[s]<target){
                s = s+1;
            }else if(nums[l]>target){
                l = l-1;
            }
        }
        return new int[] {-1,-1};
    }
}
