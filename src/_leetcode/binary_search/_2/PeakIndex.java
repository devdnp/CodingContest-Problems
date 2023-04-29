package _leetcode.binary_search._2;
//Binary-Search Day-2 Problem-2
//#852
public class PeakIndex {

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0, l=arr.length;
        while(s<l){
            int m = s + (l-s)/2;
            if(arr[m]<arr[m+1]) s = m+1;
            else l = m;
        }
        return s;
    }
}