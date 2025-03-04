import java.util.ArrayList;

public class Solution 
{

    public static int painterArea(ArrayList<Integer> arr,int area )
    {
        int painters=1;int paintArea=0;

        for(int i=0;i<arr.size();i++)
        {
            if(paintArea+arr.get(i)<=area)
            {
                paintArea=paintArea+arr.get(i);
            }
            else{
                painters++;
                paintArea=arr.get(i);
            }
            // System.out.println(paintArea);
        }
        return painters;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
            int size=boards.size();
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<size;i++)
            {
                sum=sum+boards.get(i);
                if(max<boards.get(i))
                {
                    max=boards.get(i);
                }
            }

        int left=max;
        int right=sum;
        int ans=-1;

            // for(int i=max;i<=sum;i++)
            // {
            //     if(painterArea(boards,i)==k)
            //     {
            //         return i;
            //     }
            // }
            // return max;

            while(left<=right)
            {
                int mid=(left+right)/2;
                if(painterArea(boards,mid)<=k)
                {
                    ans=mid;
                    right=mid-1;

                }
                else{
                    left=mid+1;
                }
            }
            return ans;
            

    }
}