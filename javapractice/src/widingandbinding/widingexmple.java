package widingandbinding;

	class A   //super class
	{
		public void message()
		{
			System.out.println("meaasge of a class");
		}
		class B extends A   //sub class
		{
			public void message()
			{
			System.out.println("message from B");
			}
			public static void main(String[] args) 
			{
				
				B b= new B();
				A a=b;
				a.message();
			}
		}
		
	}
	

			
			
			
			
		

	
	
		
		
