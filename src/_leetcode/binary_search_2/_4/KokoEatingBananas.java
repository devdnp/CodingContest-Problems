package _leetcode.binary_search_2._4;
//Binary-Search-2
//#875
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int[] piles, int H) {
        int maxValue = 0;
        for (int i : piles) {
            maxValue = Math.max(i, maxValue);
        }

        int lo = 1;
        int hi = maxValue;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long hours = calculateHours(piles, mid);
            if (hours > H) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    private static long calculateHours(int[] piles, int speed) {
        long hours = 0;
        for (int pile : piles) {
            hours += ((pile - 1) / speed )+ 1;
        }
        return hours;
    }
}
