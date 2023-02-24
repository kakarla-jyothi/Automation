package javapractices;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("KAkarla");
		sb.append("jyothi");
		System.out.println(sb);
		sb.append(100);
		System.out.println(sb);
		sb.append("core java");
		System.out.println(sb);
		
		
		
		StringBuffer sb1=new StringBuffer("welcome india");
		sb1.insert(7,"to");
		System.out.println(sb1);
		sb1.insert(15, "national bird is peacock");
		System.out.println(sb1);
		int len=sb1.length();
		System.out.println(len);
		sb1.reverse();
		System.out.println(sb1);
		sb1.delete(0, 5);
		System.out.println(sb1);
		
		
		
		
		
		
		
		

	}

}
