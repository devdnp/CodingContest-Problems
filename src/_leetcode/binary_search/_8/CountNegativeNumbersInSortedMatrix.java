package _leetcode.binary_search._8;
//Binary-Search-1
//#1351
public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            ans+=negativeEachRow(grid[i]);
        }
        return ans;
    }

    public static int negativeEachRow(int row[])
    {
        int ans=0;
        int l=0, h=row.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(row[mid]>=0)
                l=mid+1;
            else if(row[mid]<0)
            {
                ans+=h-mid+1;
                h=mid-1;
            }
        }
        return ans;
    }
}