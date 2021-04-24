package ArrayQuestions;

public class MaxAndMinElement_InArr
{
  public static void main(String[] args) 
  {
	int arr[] = {25,11,75,22,1};
    
    int max = arr[0];
    int min = arr[0];
    for(int i=0 ; i<arr.length ; i++)
    {
    		if(max<arr[i])
    		{
    		  max = arr[i];
    		}	
    }
    System.out.println("Maximum element "+max);
    
    for(int j=0 ; j<arr.length ; j++)
    {
    		if(min>arr[j])
    		{
    		  min = arr[j];
    		}	
    }
    System.out.println("Minimum element "+min);
  }
}
