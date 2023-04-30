package _leetcode.binary_search._3;
//Binary-Search Day-3 Problem-1
//#367

public class ValidPerfectSquare {

    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int s=0,l=46430;
        while(s<=l){
            int m = (s+l)/2;
            if(num==0 || num<0) return false;
            if(m*m==num) return true;
            else if(m*m>num) l=m-1;
            else s=m+1;
        }
        return false;
    }
}