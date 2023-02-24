package javapractices;

import java.io.BufferedReader;

public class marksinarray {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int marks[]=new int[5];
		for(int i=0; i<5; i++)
		{
			System.out.print("entermarks:");
			marks[i]=Integer.parseInt(br.readLine());
		}    
		int tot=0;
		for(int i=0; i<5; i++)
		{
			System.out.println(marks[i]);
			tot=tot+marks[i];
		}
		System.out.print("total marks="+tot);
		float percent=(float)tot/5;
		System.out.println("percentagw="+percent);
	}

		
		
		
			
			
			
					
					
					
		}
			
		

	}

}
