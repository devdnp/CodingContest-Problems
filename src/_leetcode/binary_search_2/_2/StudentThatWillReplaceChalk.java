package _leetcode.binary_search_2._2;
//Binary-Search-2
//#1894
public class StudentThatWillReplaceChalk {

    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        int k = 22;
        System.out.println(chalkReplacer(chalk,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {

        int sum = 0;
        for(int i=0;i<chalk.length;i++){
            sum += chalk[i];
            if(sum>k) return i;
        }
        //Mod will give
        k = k%sum;
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]<=k){
                k-=chalk[i];
            }else{
                return i;
            }
        }
        return chalk.length-1;

    }
}