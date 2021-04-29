/*

Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.

*/

package Array;

import java.util.Scanner;

public class Number_of_Occurrence 
{
	int count(int[] arr, int n, int x) {
        // code here
        int times = 0;
        for(int i =0; i<n ; i++)
        {
            if(x == arr[i])
            {
                times = times+1;
            }
        }
        return times;
    }
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		Number_of_Occurrence  A = new Number_of_Occurrence();
			int arr[] = {1, 1, 2, 2, 2, 2, 3};
			int n = arr.length;
			int k = sc.nextInt();
			 int result=  A.count(arr, n ,k);
	      System.out.println(result);	
	}       
}
