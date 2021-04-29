/*

Given a struct array of type Height, having two elements feet and inches. Find the maximum height among n heights, where height is calculated sum of feet and inches after converting feet into inches.

Example 1:

Input:
n = 2
h1 -> 1 2
h2 -> 2 1
Output: 
25
Explanation:
(1, 2) and (2, 1) are respective given heights.
After converting both heigths in to inches,
we get 14 and 25 as respective heights.
So, 25 is the maximum height.


*/

package Array;

import java.util.*;
import java.lang.*;

class Height
{
    int feet;
    int inches;
    
      public Height(int ft, int inc)
      {
           feet = ft;
           inches = inc;
      }
}

class Maximum_In_Struct_Array
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Height arr[] = new Height[n];
            for(int i = 0; i < n; i++)
            {
                int temp1 = sc.nextInt();
                int temp2 = sc.nextInt();
                arr[i] = new Height(temp1, temp2);
              
            }
            GfG gfg = new GfG();
            
            int res = gfg.findMax(arr, n);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // create new array with same length
    	 // create new array with same length
        int arrNew[] = new int[n];
        
        //put values in new array
        for(int i=0 ; i<n ;i++)
        {
            arrNew[i] = (12 * (arr[i].feet)) + arr[i].inches;
        }
        
        //compare inches which is in new array.
        int res=arrNew[0];
        for(int j=1; j<arrNew.length ; j++)
        {
            if(res<arrNew[j])
            {
                res = arrNew[j];
            } 
        }
        
        return res;
    }
    
}

/*
For Input:
2
2
1 2 2 1
4
3 5 7 9 5 6 5 5

your output is: 
25
93



*/


