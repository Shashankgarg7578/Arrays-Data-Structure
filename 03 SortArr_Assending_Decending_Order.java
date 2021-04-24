package ArrayQuestions;

public class SortArr_Assending_Decending_Order 
{
 public static void main(String[] args) 
 {
   int arr[] = {5,2,8,7,1};
   int temp = 0;
   
   //hum keval 1 loop nhi lga skte iski wjh s jb i ka loop end hoga too i+1 ki value hi nhi hogi koi
   // isliye compare krne k lie second element bhi keval array ki lenght tk jana chaiyen
   for(int i=0 ; i<arr.length ; i++)
   {
	  for(int j =i+1 ; j<arr.length ; j++)
	  {
		  // "<" this is used for decending order
	   if(arr[i]>arr[j])
	   {
		   temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
	   }
	  }
   }
   
   for(int x = 0 ; x<arr.length ;x++ )
   {
	   System.out.print(arr[x]+" ");
   }
 }
}
