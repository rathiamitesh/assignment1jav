package sort;
import java.util.Scanner;

class sort {
	public static void main(String[] arguments){
	      Scanner in = new Scanner(System.in);
	      int[] values = new int[15];
	      int a=0;
	      for (int i = 0; i <= 14; i=i+1)
	      {
		      values[i] = in.nextInt();
	      }
	      for (int i = 0; i <= 14; i=i+1)
	      {
		      for (int j= i; j <= 14; j=j+1)
		      {
		    	  if (values[i]<values[j])
		    	  {
		    		   a=values[i];
		    		  values[i]=values[j];
		    		  values[j]=a;
		    	  }
		      }

	      }
			
			for (int i = 0; i <= 14; i=i+1)
		      {
				System.out.print(" "+values[i]);
				}


}}