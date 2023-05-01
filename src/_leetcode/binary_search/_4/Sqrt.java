package _leetcode.binary_search._4;
////Binary-Search Day-4 Problem-1
//#69
public class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x<2) return x;

        int l = x/2;
        int s = 1;

        while(s<=l){
            int m = (s+l)/2;
            if((long)m*m>x){
                l=m-1;
            }else{
                s=m+1;
            }
        }
        return l;
    }
}