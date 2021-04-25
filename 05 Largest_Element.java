/* Given an array A[] of size n. The task is to find the largest element in it.

Example 1:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
 

Example 2:

Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output:
5
Explanation:
The largest element of given array is 5.

*/

package Array;

public class Largest_Element
{
   
	 public long largest(long arr[], long n)
	    {
	        long t = arr[0];
	        
	        for(int i=1 ; i<arr.length ; i++)
	        {
	            if(t<arr[i])
	            {
	                t = arr[i];
	            }
	        }
	        return t;
	    }
	 
	 public static void main(String[] args) 
	 {
		 Largest_Element  A = new Largest_Element();
			long arrr[] = {1, 8, 7, 56, 90};
			long n = arrr.length;
			 long result=  A.largest(arrr, n);
			 System.out.println(result);
	 }

}
