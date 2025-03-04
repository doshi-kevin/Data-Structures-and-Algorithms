import java.util.ArrayList;
public class Solution {

    public static int allocateBooks(ArrayList<Integer> arr,int pages)
    {
            int students=1;
            int pageStudents=0;

            for(int i=0;i<arr.size();i++)
            {
                if(pageStudents+arr.get(i)<=pages)
                {
                    pageStudents=pageStudents+arr.get(i);
                }
                else{
                    pageStudents=arr.get(i);
                    students++;
                }
            }
            return students;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        int sum=0;


        for(int i=0;i<arr.size();i++)
        {
            sum=sum+arr.get(i);
            if(arr.get(i)>max)
            {
                max=arr.get(i);
            }
        }
        if(m==1)
        {
            return sum;

        }
        if(m>n)
        {
            return -1;
        }

        // System.out.println(max);
        // System.out.println(sum);

        int left=max;
        int right=sum;
        int ans=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;

            if(allocateBooks(arr,mid)<=m)
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