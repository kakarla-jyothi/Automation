package seriesreverse;
import java.io.*;


public class fibonaccireverse {
	static void reverrseFibonacci(int n)
	{
		int a[]=new int[n];
	
		
		//assinging first and second elements
		a[0]=0;
		a[1]=1;
		
		for(int i=2; i<n; i++)
		{
			
			//storing sum in the 
			// preceding location
			
			a[i]= a[i-2]+ a[i-1];
		}
		for(int i=n-1; i>=0; i--)
		{
			//printing array in 
			//reverse order
			System.out.print(a[i]+"");
		}
	}
	//driver function

	public static void main(String[] args) {
		int n=10;
		
		reverrseFibonacci(n);
		
		
	}


	}


