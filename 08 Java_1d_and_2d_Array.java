/*
Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

Example 1:

â€‹Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, ths sum of left diagonal (1+ 2 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.

â€‹Example 2:

Input : arr[][] = {{1,2}, {1, 2}} and N = 2
brr[] = {10, 1} 
Output :  3 10 

*/

package Array;

import java.util.ArrayList;

public class Java_1d_and_2d_Array 
{

	public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
         ArrayList<Integer> arl = new ArrayList<>();
        int i,j,s=0;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(i==j)
                {
                    s = s+a[i][j];
                }
            }
        }
        arl.add(s);
        int max = b[0];
        for(i=1;i<b.length;i++)
        {
            if(max<b[i])
            {
                max = b[i];
            }
        }
        arl.add(max);
        return arl;
    }

	public static void main(String[] args) 
	{
		Java_1d_and_2d_Array JA = new Java_1d_and_2d_Array();
		int arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} ;
		int brr[] = {3, 6, 9};
		int n = brr.length;
		 ArrayList<Integer> ans = JA.array(arr, brr, n);
        for(int i: ans)
            System.out.print(i + " ");
        System.out.println();

	}

}
