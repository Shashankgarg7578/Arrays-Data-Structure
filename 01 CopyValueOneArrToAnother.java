package ArrayQuestions;

public class CopyValueOneArrToAnother 
{
  public static void main(String[] args) 
  {
	 int arr1[] = {2,3,4,5,6,7};
	 //create same length array
	 int arr2[] = new int[arr1.length];
	 
	 //copy value arr1 to arr2
	 for(int i=0 ; i<=arr1.length-1;i++)
	 {
			 arr2[i] = arr1[i]; 
	 }
	 
      int z=0,x=0;
      System.out.println("arr1");
      while(x<arr1.length)
	  {
		 System.out.print(arr1[x]+" ");
		 x++;
	 }
    
     System.out.println();

     //print copied array
    System.out.println("arr2");
	 while(z<arr2.length)
	 {
		 System.out.print(+arr2[z]+" ");
		 z++;
	 }
  }
}
