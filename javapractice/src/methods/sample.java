package methods;

public class sample {
	private double x,y;
	sample (double a, double b)
	{
		x=a;
		y=b;
		
	}
	void sum()
	{
		double z=x+y;
		System.out.println("sumis:"+z);
	}
}
class method 
{
	public static void main(String args[])
	{
		sample s=new sample(45.6789,78.12345);
		s.sum()	;
	}

		
		

	}


