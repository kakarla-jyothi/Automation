package javapractices;

public class strings {

	public static void main(String[] args) {
		String t="welcome";
		String t1="India";
		System.out.println("lengt is:"+t.length());
		System.out.println("character position:"+t.charAt(3));
		System.out.println("index of Character:"+t.indexOf('o'));
		t=t.concat("to java class");
		System.out.println("concatenation:"+t);
		String p[]=t.split(" ");
		System.out.println("after spliting:"+p[0]+":"+p[1]);
		System.out.println("Substring:"+t.substring(0,5));
		System.out.println("converting to upper case:"+t.toUpperCase());
		System.out.println("converting to upper case:"+t1.toLowerCase());
		
		
		
		

	}

}
