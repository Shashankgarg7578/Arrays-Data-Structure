/*
Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1

*/

package Array;

public class CyclicRotate {

	 public long[] rotate(long arr[], long n)
	    {
	    
	     long x = arr[arr.length-1], i;
	       for ( i = arr.length-1; i > 0; i--)
	       {
	    	   arr[(int) i] = arr[(int) (i-1)];
	        }
	       arr[0] = x;
	       return arr;  
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicRotate  c = new CyclicRotate ();
		long arrr[] = {10, 11, 1, 2, 3};
		long n = arrr.length;
		
	   long A[]	 = c.rotate(arrr, n);
		for(long q = 0 ; q<A.length ; q++)
		{
			System.out.print(A[(int) q]+" ");
		}
	}

}
