package _leetcode.binary_search._11;
//Binary-Search-1
//#33
public class SearchRotatedSortedArr {

    public static void main(String[] args) {
        int[] num = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(num,target));
    }
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[end] >= target && nums[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}