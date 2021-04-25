/*
You are given an array arr[], you have to re-construct an array arr[].
The values in arr[] are obtained by doing OR(bitwise or) of consecutive elements in the array.

Example 1:

â€‹Input : arr[ ] = {10, 11, 1, 2, 3}
Output : 11 11 3 3 3
Explanation:
At index 0, arr[0] or arr[1] = 11
At index 1, arr[1] or arr[2] = 11
At index 2, arr[2] or arr[3] = 3
...
At index 4, No element is left So, it will 
remain as it is.
New Array will be {11, 11, 3, 3, 3}.

â€‹Example 2:

Input : arr[ ] = {5, 9, 2, 6} 
Output :  13 11 6 6 
*/


package Array;

public class Play_with_OR 
{
	public static int[] game_with_number (int arr[], int n) {
        // Complete the function
         int x = arr[0];
	        int y = arr[1];
	        int Out[] = new int[n];
	        Out[arr.length-1] = arr[arr.length-1];
			
	        for(int i = 0 ; i < n-1 ; i++)
	        {
	            
	            x = arr[i];
	            y = arr[i+1];
	            Out[i] = x|y;
	        }
	       	
	        return Out;
    }
	
	public static void main(String[] args) 
	{
		Play_with_OR   A = new Play_with_OR ();
		int arrr[] = {10, 11, 1, 2, 3};
		int n = arrr.length;
		 int[] result=  A.game_with_number(arrr, n);
		 for(int k=0 ; k<result.length ; k++)
		 {
		   System.out.print(result[k]+" ");
		 }
	}

}
