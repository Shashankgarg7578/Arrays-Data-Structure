/*
Pitsy needs help in the given task by her teacher. The task is to divide a array into two sub array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.

Example 1:

â€‹Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3
Sum up an array from index 2 to 3 = 7
Their multiplication is 21.

Example 2:

Input : arr[ ] = {1, 2} 
Output :  2 
*/

package Array;

public class Mul_Left_Right_Array_Sum 
{
	     int multiply(int arr[], int n) 
	    {
	        //Complete the function
	    	 int temp1 =0;
	    	 int temp2 =0;
	       for(int i=0 ; i<n ; i++)
	       {
	        if(i<(n/2))
	        {
	        	temp1 = temp1+arr[i];
	        }
	        else
	        {
	        	temp2 = temp2+arr[i];
	        }
	       }
	       
	       return (temp1*temp2);
		
	    }
	 
  public static void main(String[] args)
  {
	  Mul_Left_Right_Array_Sum m = new Mul_Left_Right_Array_Sum();
       int arr[] = {1, 2, 3, 4};
       int n  = arr.length;
	int result =  m.multiply(arr, n);
  System.out.println(result);
  }
}
