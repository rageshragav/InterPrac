//package arrays;
package training;
public class MinimumVal {
	public static void min(int b[])
	{
	   int	min=b[0];
	   for(int i=1;i<b.length;i++)
	   {
		   if(min>b[i]){
			   min=b[i];
			   System.out.println(min);
		   }
	   }
		
	}

	public static void main(String[] args) {
        int a[]={5,2,45,6};
		 min(a);
	}

}

