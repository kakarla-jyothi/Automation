package javapractices;

public class equlasmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jyothi";
		String s2="JYOTHI";
		String s3="kavitha";
		String s4="jyothi";
		String s5=new String("jyothi");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		
		String s7="sushma";
		String s8="sushma";
		System.out.println(s7.compareToIgnoreCase(s8));
		//System.out.println(s8.compareTo(s7));
				
		
				

	}

}
