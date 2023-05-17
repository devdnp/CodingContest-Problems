package _leetcode.binary_search_2._8;
//Binary-Search-2
//#240
public class Search2DMatrixII {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        //Step 1
        int row = rows - 1;
        int column = 0;
        //Step 3
        while(row >= 0 && column < columns)
        {
            //Step 2
            if(target == matrix[row][column])
                return true;
            else if(target < matrix[row][column])
                row--;
            else
                column++;
        }
        //Step 4
        return false;
    }
}