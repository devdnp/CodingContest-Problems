package _leetcode._2016._q3._warmup;
//#386
import java.util.ArrayList;
import java.util.List;

//21-08-2016
public class LexicographicalNumbers {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int curr = 1;

        for(int i=1; i<=n; i++){
            result.add(curr);

            if(curr*10<=n){
                curr*=10;
            }else  if(curr+1<=n && curr%10!=9){
                curr+=1;
            }else{
                while(curr/10 %10 == 9){
                    curr/=10;
                }
                curr  = curr/10 +1;
            }
        }
        return result;
    }
}
