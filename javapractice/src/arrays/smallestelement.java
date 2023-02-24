package arrays;

public class smallestelement {

	public static void main(String[] args) {
		int a[]={4,5,3,5,2,9,6};
		int large=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(a[i]<large)
			{
				large=a[i];
				
			}
		}
		
			System.out.println("the large number is:"+large);
		}
	}

			
