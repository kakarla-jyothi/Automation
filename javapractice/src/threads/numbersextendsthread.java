package threads;

public class numbersextendsthread {
	
		public void run()
		{
			for(int bvar=-128; bvar<128; bvar++)
			{
				System.out.println(bvar);
			}
		}
	}
class ThreadTest
{
	
	public static void main(String[] args) {
		numbers num=new numbers();
		num.Start();
		
	}
	
}
// TODO Auto-generated method stub



