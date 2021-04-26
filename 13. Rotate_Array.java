/*
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

*/

package Array;

import java.util.Scanner;

public class Rotate_Array 
{
	public static void main (String[] args)
	 {
 Scanner sc = new Scanner(System.in);
 System.out.print("No. Of Arrays :-");   
 int T = sc.nextInt();
    int x = 1;
    
      while(x<=T)
      {
    	System.out.print("Size Of array :-");
    	int N = sc.nextInt();
    	System.out.print("Size of Rotation :-");
    	int D = sc.nextInt();
    	int arr[] = new int[N];
    	int arr_rotate[] = new int[N];
    	
    	//create array
    	for(int i = 0 ; i < N ; i++)
    	{
    		System.out.print("Enter a value of array "+i+" :-");
    		arr[i] = sc.nextInt(); 
    	}
    	
    	//rotate and store in new array
    	for(int j=0 ; j < N ; j++)
    	{
    		arr_rotate[j] = arr[(j+D)% N];
    	}
    	
    	System.out.print("New Rotated array :-");
    	//print new rotated array
    	for(int k=0 ; k < N ; k++)
    	{
    		System.out.print(arr_rotate[k]+" ");
    	}
    	x++;
    	System.out.println();
      }
	 }
}