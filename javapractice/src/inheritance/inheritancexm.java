package inheritance;
 class superex
{
		void display()
		{
			System.out.println("super class");
		}
}
 class subex extends superex
 {
	 void show()
	 {
		 System.out.println("sub class");
	 }
 }
 class single
 {
	 public static void main(String args[])
	 {
		 subex s=new subex();
		 s.show();
		 s.display();
		 
	 }
 }
 
		
	

		

