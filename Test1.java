package test;
import java.util.Scanner;

class Square {
			public static void main(String[] arguments){
			      Scanner in = new Scanner(System.in);
			      int a = in.nextInt();
			      int b=0;
			for (int i = 1; i <= 2*a+1; i=i+1) {
				if (i<a+1)
				{b=i*2;
				}
				else if (i==a+1)
				{
					b=i*2-1;
				}
				else if (i>a+1)
				{
					b=2*(2*a+2-i);
				}

					{for (int j = 0; j < b; j=j+1)
				{
						System.out.print("*" );
						

						
				}}
				
					
					System.out.println("" );
				}
				}
		} 

