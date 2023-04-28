package _leetcode._2023._q1._01Jan;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left = 10, right = 19;
        System.out.println(Arrays.toString(closestPrimes(left,right)));
    }

    static int[] closestPrimes(int left, int right) {
        final boolean[] primes = sieveOfEratosthenes(right);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(left <= 1)
            left = 2;

        for(int i = left; i <= right; i++) {
            if(primes[i])
                pq.add(i);
        }
        if(pq.isEmpty())
            return new int[]{-1,-1};

        int l = -1,r = -1,diff = 999999;
        int s1 = pq.poll();

        while(!pq.isEmpty()) {
            int s2 = pq.poll();
            if(s2 - s1 < diff) {
                l = s1;
                r = s2;
                diff = r - l;
            }
            s1 = s2;
        }
        return new int[]{l,r};
    }

    //an ancient algorithm for finding all prime numbers up to any given limit
    static boolean[] sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
}
