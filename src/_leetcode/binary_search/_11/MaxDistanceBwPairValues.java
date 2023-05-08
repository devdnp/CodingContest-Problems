package _leetcode.binary_search._11;
//Binary-Search-1
//#1855
public class MaxDistanceBwPairValues {

    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};
        System.out.println(maxDistance(nums1,nums2));
    }
    public static int maxDistance(int[] nums1, int[] nums2) {
        int dist = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                i++;
                j++;
            } else {
                if (dist < j - i) {
                    dist = j - i;
                }
                j++;
            }
        }
        return dist;
    }
}