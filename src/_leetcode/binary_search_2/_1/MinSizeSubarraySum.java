package _leetcode.binary_search_2._1;
//Binary-Search-2
//#209
public class MinSizeSubarraySum {

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int start = 0,  end = 0,  sum = 0,  minLength = Integer.MAX_VALUE;

        while (end < nums.length) {
            sum += nums[end++];

            while (sum >= target) {
                minLength = Math.min(minLength, end - start);
                sum -= nums[start++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}