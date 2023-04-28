package _leetcode.binary_search._1;
//Binary-Search Day-1 Problem-2
//#374
public class GuessNumberHigherOrLower {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
    static int guess(int m){
        int pick = 6;
        if(m<6) return 1;
        else if(m>6) return -1;
        return 0;
    }
    public static int guessNumber(int n) {
        int s = 1, l = n;
        while(s<l){
            int m = s+(l-s)/2;
            if(guess(m)==0) return m;
            else if(guess(m)==1) s=m+1;
            else l=m-1;
        }
        return s;
    }
}