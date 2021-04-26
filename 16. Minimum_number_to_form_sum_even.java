/*
Given an array arr[] of size N, the task is to add the minimum number(should be greater than 0) to the array so that the sum of the array becomes even

Example 1:

Input: N = 8
arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output:  2
Explanation:  Sum of array is 36, so 
we add minimum number 2 to make the 
sum even.

Example 2:

Input: N = 9
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
Output:  1

*/

package Array;

public class Minimum_number_to_form_sum_even {

	public static void main(String[] args) 
	{
		int A[] = {1, 2, 3, 4, 5, 6, 7, 8};
		  // Your code goes here
	      long sum = 0;
	      long x ;
	        for(long i =0 ; i<A.length ; i++)
	        {
	            sum = sum + A[(int)i];
	        }
	        if((sum%2)==0)
	        {
	            x= 2;
	            System.out.println(x);
	        }
	        else
	        {
	            x=1;
	            System.out.println(x);
	        }
	        }
}
