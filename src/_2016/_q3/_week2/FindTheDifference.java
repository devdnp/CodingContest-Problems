package _2016._q3._week2;
//#389
import java.util.Arrays;

public class FindTheDifference {
    static char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        for(int i=0; i<s1.length; i++){
            if(s1[i]!=t1[i]){
                return t1[i];
            }
        }
        return t1[t1.length-1];
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
