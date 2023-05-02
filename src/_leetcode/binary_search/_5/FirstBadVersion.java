package _leetcode.binary_search._5;
//#278


public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5, bad = 4;
        System.out.println(firstBadVersion(n,bad));
    }
    public static boolean isbad(int bad){

        return bad>0 ? true : false;
    }
    public static int firstBadVersion(int n, int bad) {
        int s = 1, l = n;
        while(s<l){
            int m = s + (l-s)/2;
            if(isbad(m)) l = m;
            else s = m+1;
        }
        return s;
    }
}
