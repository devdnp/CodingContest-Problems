package _leetcode.binary_search._7;
//Binary-Search-1
//#167
import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;

        while(s < l){
            int x = nums[s];
            int y = nums[l];

            int m = (s + l)/2;

            if(x + y == target){
                break;
            }

            if(x + y < target){
                s = (nums[m] + y <= target ? m : s+1);
            } else{
                l = (x + nums[m] >= target ? m : l-1);
            }
        }
        return new int[] {s+1, l+1};
    }
}
