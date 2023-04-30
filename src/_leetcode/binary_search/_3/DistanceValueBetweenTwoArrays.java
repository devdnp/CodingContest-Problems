package _leetcode.binary_search._3;
//Binary-Search Day-3 Problem-2
//#1385

public class DistanceValueBetweenTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0; boolean flag=true;
        for(int i=0;i<arr1.length;i++)
        {
            flag=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d) {
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }

        return count;
    }
}