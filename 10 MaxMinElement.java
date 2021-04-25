package Array;

public class MaxMinElement
{
  public static void main(String[] args) 
  {
	int arr[] = {3, 2, 1, 56, 10000, 167}; // 10 elements in array
     
	int max  = arr[0];
	int min = arr[0];
	for(int i=0 ; i<arr.length ; i++)
	{
		if(arr[i]>max)
		{
			max = arr[i];
		}
		if(arr[i]<min)
		{
			min = arr[i];
		}
		
	}
	System.out.println("Maximum : "+max);
	System.out.println("Minimum : "+min);
  }
}
