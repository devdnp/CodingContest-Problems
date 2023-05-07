package _leetcode.binary_search._10;
//Binary-Search-1
//#350
import java.util.Arrays;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 ={1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] occ1 = new int[1001];
        int[] ans = new int[1001];

        for(int i=0; i<nums1.length; i++)
            occ1[nums1[i]]++;

        int idx = 0;
        for(int i=0; i<nums2.length; i++) {
            int val = nums2[i];
            if(occ1[val] > 0) {
                ans[idx] = val;
                occ1[val]--;
                idx++;
            }
        }

        return Arrays.copyOfRange(ans, 0, idx);
    }
}