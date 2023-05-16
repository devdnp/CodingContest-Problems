package _leetcode.binary_search_2._7;
//Binary-Search-2
//#1482
public class MinDaysToMakeBouquets {

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m =3, k =1;
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < m * k) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int numDays = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int bouquets = 0;
            int i = 0;
            while (i < n && bouquets < m) {
                int count = 0;
                while (i < n && bloomDay[i] <= mid && count < k) {
                    count++;
                    i++;
                }
                if (count == k) {
                    bouquets++;
                }
                else {
                    i++;
                }
            }

            if (bouquets == m) {
                numDays = mid;
                max = mid-1;
            }
            else {
                min = mid+1;
            }
        }

        return numDays;
    }
}