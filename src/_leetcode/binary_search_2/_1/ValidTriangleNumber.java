package _leetcode.binary_search_2._1;

import java.util.Arrays;

//Binary-Search-2
//#611
public class ValidTriangleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        System.out.println(triangleNumber(nums));
    }
    public static int triangleNumber(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int count=0;
        for(int i=n-1;i>=1;i--){
            int left=0,right=i-1;
            while(left<right){
                if(a[left]+a[right]>a[i]){
                    count+=right-left;
                    right--;
                }
                else
                    left++;
            }
        }
        return count;
    }
}