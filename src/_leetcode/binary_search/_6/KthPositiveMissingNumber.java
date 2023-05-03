package _leetcode.binary_search._6;
//Binary-Search-1
//#1539
public class KthPositiveMissingNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] - mid - 1 < k) left = mid + 1;
            else right = mid - 1;
        }
        return left + k;
    }
}