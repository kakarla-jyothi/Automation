package polymorphism;
class sample
{
	void add (int a , int b)
	{
		System.out.println("sum of two numbers:"+(a+b));
		
	}
	void add( int a, int b, int c){
		System.out.println("sum of three numbers:"+(a+b+c));
	}
}


public class staticpolymarphysm {

	public static void main(String[] args) {
		sample s= new sample();
		s.add(56,66,77);
		s.add(35,890);
	}
}

		

