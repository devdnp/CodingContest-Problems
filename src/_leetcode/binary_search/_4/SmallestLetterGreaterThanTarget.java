package _leetcode.binary_search._4;
////Binary-Search Day-4 Problem-2
//#744
public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int s=0, l=letters.length-1;
        char r = letters[0];

        while(s<=l){
            int m = s+(l-s)/2;
            if(letters[m]==target || target>letters[m]) s=m+1;
            else if(letters[m]>target){
                r = letters[m];
                l=m-1;
            }
        }
        return r;
    }
}
