package _leetcode.binary_search_2._2;
//Binary-Search-2
//#658
import java.util.*;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[]  input = {1,2,3,4,5};
        int k = 4, x = -1;//3;
        System.out.println(findClosestElements(input,k,x));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> container = new PriorityQueue<>((int[] a, int[] b) -> (a[0] == b[0]) ? -(a[1]-b[1]) : -(a[0]-b[0]));
        for (int num : arr) {
            container.add(new int[] { Math.abs(x - num), num });
            if (container.size() > k) container.poll();
        }

        List<Integer> nums = new ArrayList<>();
        while (!container.isEmpty()) nums.add(container.poll()[1]);
        Collections.sort(nums);
        return nums;
    }
}