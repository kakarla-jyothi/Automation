package javapractices;

public class fibinccoseries {

	public static void main(String[] args) {
		int a=0,b=1,c,n=10;
		System.out.println(a+" "+b);
		for(int i=3; i<=10; i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		
		}
		// TODO Auto-generated method stub

	}

}
