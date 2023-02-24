package tolaizerclass;

import java.util.Arrays;

public class arraypackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {56,66,77,12,2,3,4};
		Arrays.sort(ar,0,4);
		System.out.println("sorted array in range is :/n"+Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("completeto sorted array:/n"+ Arrays.toString(ar));
		int index=Arrays.binarySearch(ar,66);
		System.out.println("position index value is:/n"+index);
		int[] rcopy=Arrays.copyOf(ar,(int) 1.5);
		System.out.println("copied sub array:/n"+Arrays.toString(rcopy));
		Arrays.fill(ar,10);
		System.out.println("Array completely filled:/n"+Arrays.toString(ar));
	}
}

		
		
		
		
		
		

