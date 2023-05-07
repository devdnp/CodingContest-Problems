package _leetcode.binary_search._10;
//Binary-Search-1
//#633
public class SumSquareNumbers {

    public static void main(String[] args) {
        int c = 5;
        System.out.println(judgeSquareSum(c));
    }
    public static boolean judgeSquareSum(int c) {
        long i =0 ;
        long j = (long)Math.sqrt(c);
        while(i<=j){
            long mid = i*i+j*j;
            if(mid == c){
                return true;
            }
            else if(mid > c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}