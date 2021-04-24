package ArrayQuestions;

public class FrequencyEveryElementInArr
{
  public static void main(String[] args) 
  {
    int arr1[] = {2,3,2,2,4,5,5,7,7};
    
   
    
    for(int i=0 ; i<arr1.length ; i++)
    {
    	int counter = 0;
    	for(int j=0 ; j<arr1.length;j++)
    	{
    		if(j<i && arr1[i] == arr1[j])
    		{
    			break;
    		}
    		if(arr1[i]==arr1[j])
    		{
    			counter++;
    		}
    		if(j==arr1.length-1)
    		{
    			System.out.println("the value is "+arr1[i]+" and value counter is "+counter);
    		}
    	}
    }
  }
}
