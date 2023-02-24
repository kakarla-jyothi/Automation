package arrays;

public class sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,7,2};
		int sort =0;
		for (int i=0; i<a.length;i++)
		{
			for( int j=1+i;j<a.length;j++)
			{
				if(a[i]> a[j])
				{
					sort=a[i];
					a[i]=a[j];
					a[j]=sort;
				}
			}
			System.out.println(a[i]);
		}
	}
}

