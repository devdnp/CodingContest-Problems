package _leetcode.binary_search_2._5;
//Binary-Search-2
//#1283
public class SmallestDivisorGivenThreshold {

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold=6;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 1000000;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (helper(mid, nums) > threshold) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    public static int helper(int mid, int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += (nums[i] + mid - 1) / mid;
        }
        return res;
    }
}