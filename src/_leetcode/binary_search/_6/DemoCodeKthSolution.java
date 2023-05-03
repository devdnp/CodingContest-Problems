package _leetcode.binary_search._6;

public class DemoCodeKthSolution {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }
}
