package _leetcode.binary_search_2._3;
//Binary-Search-2
//#1760
public class MinLimitOfBallsInBag {

    public static void main(String[] args) {
        int[] nums = {9};
        int maxOperations = 2;
        System.out.println(minimumSize(nums,maxOperations));
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int min = 0;
        int max = 1000000000;

        while (min +1< max) {
            int mid = (max - min)/2 + min;
            int count = 0;

            for (int a: nums) {
                count+=(a-1)/mid;
            }

            if (count <= maxOperations) {
                max = mid;
            } else {
                min = mid;
            }
        }
        return max;
    }
}