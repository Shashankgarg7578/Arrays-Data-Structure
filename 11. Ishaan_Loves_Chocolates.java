/*
As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. Each of the squares has a tastiness level which is denoted by an array A[].
Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first. 
Determine the tastiness level of the square which his sister gets.

Example 1:

â€‹Input : arr[ ] = {5, 3, 1, 6, 9}
Output : 1
Explanation:
Initially: 5 3 1 6 9
In first step: 5 3 1 6
In Second step: 5 3 1
In Third step: 3 1
â€‹In Fourth step: 1
â€‹â€‹Return 1


â€‹Example 2:

Input : arr[ ] = {5, 9, 2, 6} 
Output :  2

*/

package Array;

public class Ishaan_Loves_Chocolates 
{
	 public static int chocolates (int arr[], int n) 
	    {
	        //Complete the function
	      int i,j;
	      i = 0; j = n-1;
	      while( i != j ) 
	      {
	         if( arr[i] >= arr[j] && i < j )
	         {
	           i++;
	         }
	         else if( arr[j] >= arr[i] && j > i )
	         {
	            j--; 
	         }
	      }
	      return arr[i];
	    }
	 
	public static void main(String[] args) 
	{
		Ishaan_Loves_Chocolates Ishan = new Ishaan_Loves_Chocolates();
		int a[] = {5, 3, 1, 6, 9};
		int n = a.length;
		int chochlate = Ishan.chocolates(a, n);
		System.out.println(chochlate);
	}

}
