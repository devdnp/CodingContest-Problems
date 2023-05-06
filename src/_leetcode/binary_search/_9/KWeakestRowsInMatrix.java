package _leetcode.binary_search._9;

import java.util.Arrays;

//Binary-Search-1
//#1337
public class KWeakestRowsInMatrix {

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }
    static int numberOfSoldiers(int[] mat){
        for(int i=0;i<mat.length;i++)
            if(mat[i]==0)
                return i;
        return mat.length;
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] storage= new int[mat[0].length+1][mat.length];
        int[] count=new int[mat[0].length+1];
        for(int i=0;i<mat.length;i++){
            int temp=numberOfSoldiers(mat[i]);
            storage[temp][count[temp]]=i+1;
            count[temp]++;
        }
        int[] result=new int[k];
        int position=0;
        for(int i=0;i<mat[0].length+1;i++){
            for(int j=0;j<count[i];j++){
                result[position]=storage[i][j]-1;
                position++;
                if(position==k)
                    return result;
            }
        }
        return result;
    }

}