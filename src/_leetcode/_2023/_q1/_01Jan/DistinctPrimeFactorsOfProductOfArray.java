package _leetcode._2023._q1._01Jan;

import java.util.HashSet;

public class DistinctPrimeFactorsOfProductOfArray {
    public static void main(String[] args) {
        int[] nums = {2,4,3,7,10,6};
        System.out.println(distinctPrimeFactors(nums));
    }
    static int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> m = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            int sqr =(int) Math.sqrt(nums[i]);

            for(int j=2; j<=sqr; j++){
                if(nums[i]%j==0){
                    m.add(j);

                    while(nums[i]%j==0){
                        nums[i] /= j;
                    }
                }
            }
            if(nums[i]>1){
                m.add(nums[i]);
            }
        }
        return m.size();
    }
}
