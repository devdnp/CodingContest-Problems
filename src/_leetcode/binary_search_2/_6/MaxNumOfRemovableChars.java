package _leetcode.binary_search_2._6;
//Binary-Search-2
//#1898
public class MaxNumOfRemovableChars {

    public static void main(String[] args) {
        String s = "abcacb", p = "ab";
        int[] removable = {3,1,0};
        System.out.println(maximumRemovals(s,p,removable));
    }
    public static int maximumRemovals(String s, String p, int[] removable) {
        int l = -1;
        int r = removable.length;
        char[] pArray = p.toCharArray();
        char[] sArray = s.toCharArray();
        int start = -1;
        while(l + 1 < r) {
            int m = l + ((r - l) >> 1);
            if (isSub(sArray, pArray, removable, start + 1, m)) {
                l = m;
                start = l;
            } else {
                r = m;
                sArray = s.toCharArray();
                start = -1;
            }
        }
        return l + 1;
    }
    public static boolean isSub(char[] s, char[] p, int[] removable, int start, int k) {
        for (int i = start; i <= k; i++) {
            s[removable[i]] = '.';
        }
        int i = 0, j = 0;
        while (i < s.length && j < p.length) {
            if (s[i] == p[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == p.length;
    }
}