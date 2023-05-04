package _leetcode.binary_search._7;
//Binary-Search-1
//#1608

public class SpecialArrayWithXElementsGreaterOrEqualX {

    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        int start=0;
        int end=nums.length;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int curr=count(nums,mid);
            if(curr==mid)
            {
                return mid;
            }
            else if(curr<mid)
            {
                end=mid-1;
            }
            else if(curr>mid)
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static int count(int[]arr,int t)
    {
        int c=0;
        for(int i:arr)
        {
            if(i>=t)
            {
                c++;
            }
        }
        return c;
    }
}