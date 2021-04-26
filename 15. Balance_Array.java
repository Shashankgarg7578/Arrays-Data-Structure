/*
Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.


Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 1
Explanation: 
Sum of first 2 elements is 1 + 5  = 6, 
Sum of last 2 elements is 3 + 2  = 5,
To make the array balanced you can add 1.

Example 2:

Input:
N = 6
arr[] = { 1, 2, 1, 2, 1, 3 }
Output: 2
Explanation:
Sum of first 3 elements is 1 + 2 + 1 = 4, 
Sum of last three elements is 2 + 1 + 3 = 6,
To make the array balanced you can add 2.

*/

package Array;

public class Balance_Array
{
	long minValueToBalance(long arr[] ,int n)
    {
	 
       long x =0;
       long y =0;
       long z=0;
      
       for(long i=0 ; i<arr.length/2 ; i++)
       {
	      x = x + arr[(int) i]; 
       }
       for(long j=arr.length-1 ; j>=arr.length/2 ; j--)
       {
	      y = y + arr[(int) j]; 
       }

       if(x>y)
       {
	      z = x-y; 
	   }
       else if(x<y)
       {
	      z = y-x;
	   }
         
       return z;

    }

  public static void main(String[] args) 
  {
	 long arr[] = {1,2,1,2,1,3};
	 int n= arr.length;
	 Balance_Array b = new Balance_Array();
	 long q =b.minValueToBalance(arr, n);
  System.out.println(q);
  }
}
