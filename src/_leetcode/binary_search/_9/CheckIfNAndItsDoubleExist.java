package _leetcode.binary_search._9;
//Binary-Search-1
//#1346
import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        int[] arr ={10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int res = binarySearch(arr, arr[i]*2);
            if(res != -1 && res != i){
                return true;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}