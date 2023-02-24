package tolaizerclass;

import java.util.StringTokenizer;

public class demo {

	public static void main(String[] args) {
		String s="hello its a java program";
		StringTokenizer st=new StringTokenizer(s," ");
				while(st.hasMoreTokens ())
				{
					System.out.println(st.nextToken());
					
					
				}
	

	}

}
