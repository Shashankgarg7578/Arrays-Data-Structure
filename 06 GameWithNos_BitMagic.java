/* You are given an array arr[], you have to re-construct an array arr[].
The values in arr[] are obtained by doing Xor of consecutive elements in the array.

Example 1:

â€‹Input : arr[ ] = {10, 11, 1, 2, 3}
Output : 1 10 3 1 3
Explanation:
At index 0, arr[0] xor arr[1] = 1
At index 1, arr[1] xor arr[2] = 10
At index 2, arr[2] xor arr[3] = 3
...
At index 4, No element is left So, it will remain as
it is.
New Array will be {1, 10, 3, 1, 3}.

â€‹Example 2:

Input : arr[ ] = {5, 9, 7, 6} 
Output :  12 14 1 6 

*/

package Array;

public class GameWithNos_BitMagic 
{
	
	    // Function for finding maximum and value pair
	    public  int[] game_with_number(int arr[], int n) 
	    {
	        // Complete the function
	   
	        int x = arr[0];
	        int y = arr[1];
	        int Out[] = new int[n];
	       
	        for(int i = 0 ; i < n-1 ; i++)
	        {
	        	x = arr[i];
	            y = arr[i+1];
	            Out[i] = x^y;
	        }
	        Out[arr.length-1] = arr[arr.length-1];
			
	        return Out;
	            
	    }
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameWithNos_BitMagic c = new GameWithNos_BitMagic();
		int arrr[] = {10, 11, 1, 2, 3};
		int n = arrr.length;
		
		int A[] = c.game_with_number(arrr, n);
		for(int i=0 ; i<A.length ; i++)
		{
			System.out.print(A[i]+" ");
		}
	}

}
