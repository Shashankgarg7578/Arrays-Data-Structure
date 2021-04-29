/*

Given an array Arr of N positive integers, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:

Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.
Example 2:

Input:
N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
Output: 50 30 23
Explanation: 3 Largest element in the
array are 50, 30 and 23.

*/

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class k_largest_elements 
{
	 int[] kLargest(int[] arr, int n, int k) 
	    {
	        Arrays.sort(arr);
	        int arr1[] = new int[k];
	        int i=0;
	      for(int x = arr.length-1 ; x >= arr.length-k ;x--)
	      {
	        arr1[i] = arr[x];
	        i++;
	      }
	      
	      return arr1;
	    }
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 k_largest_elements  A = new k_largest_elements();
			int arr[] = {2,3,4,2,1};
			int n = arr.length;
			int k = sc.nextInt();
			 int[] result=  A.kLargest(arr, n ,k);
			 
			 for(int j =0 ; j<result.length ;j++)
			 {
			 System.out.println(result[j]);
	 
			 }
	 }
}
