/*
Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.

Example 1:

Input : A[] = {5, 7, 9, 3, 6, 2}, 
        B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2. 
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.

Example 2:

Input : A[] = {0, 0, 0, 0}, 
           B[] = {1, -1, 2}
Output : 0

*/

package Array;

public class Product_maximum_firstArray_and_minimum_second {

	public static void main(String[] args) 
	{
	int	arr[] = {5, 7, 9, 3, 6, 2}; 
	int	brr[] = {1, 2, 6, -1, 0, 9};
		 int x = arr[0];
	        int y = brr[0];
	        for(int i = 1 ; i < arr.length ; i++)
	        {  
	            if(x < arr[i])
	            {
	                x = arr[i];
	            }
	        }
	        for(int j = 1 ; j < brr.length ; j++)
	        {  
	            if(y > brr[j])
	            {
	                y = brr[j];
	            }
	        }
	        
	        int z = x * y;
        System.out.println(z);
	}

}
