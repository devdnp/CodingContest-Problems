package _leetcode.binary_search_2._5;
//Binary-Search-2
//#287
public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length-1;
        while(low <= high)
        {
            int count = 0;
            int mid = low + (high - low)/2;
            for(int num : nums)
            {
                if(num <= mid) count++;
            }
            if (count <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}