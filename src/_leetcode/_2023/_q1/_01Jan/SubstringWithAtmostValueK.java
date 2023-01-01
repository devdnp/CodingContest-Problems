package _leetcode._2023._q1._01Jan;

import java.math.BigInteger;

public class SubstringWithAtmostValueK {
    public static void main(String[] args) {
        String str = "238182";
        int k =5;
        System.out.println(minimumPartition(str, k));
    }
    static int minimumPartition(String str, int k) {
        boolean flag = false;

        char[] s = str.toCharArray();
        int n = s.length;

        if(k<10){
            for(int i=0;i<n;i++){
                if(s[i]-'0'>k)
                    flag=true;
            }
        }

        if(flag) return -1;
        int ans = 0;

        BigInteger num =  BigInteger.ZERO;
        for(int i=0;i<n;i++){
            int d = s[i]-'0';

            num= num.multiply(BigInteger.TEN).add(BigInteger.valueOf(d));
            if(num.compareTo(BigInteger.valueOf(k))>0){
                ans++;
                num = BigInteger.valueOf(d);
            }

        }

        if(num.compareTo(BigInteger.ZERO) > 0) ans++;
        return ans;
    }
}
