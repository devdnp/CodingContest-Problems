package _leetcode.binary_search._8;
//Binary-Search-1
//#74
public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int n = matrix[i].length - 1;

            if(target <= matrix[i][n]){

                int s = 0;
                int e = n;
                while(s <= e){
                    int mid = s + (e - s)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] < target){
                        s = mid + 1;
                    }else{
                        e = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
