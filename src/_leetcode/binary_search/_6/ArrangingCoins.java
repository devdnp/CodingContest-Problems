package _leetcode.binary_search._6;
//Binary-Search-1
//#441
public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        long s=1,l=n,m,ans=0;
        while(s<=l){
            m = s +(l-s)/2;
            if((m*(m+1))/2<=n){
                ans=m;
                s=m+1;
            }else{
                l=m-1;
            }
        }
        return (int)ans;
    }
}
