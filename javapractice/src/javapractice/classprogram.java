package javapractice;

class person
{
	String name;
	int age;
	 void talk()
	 {
		 System.out.println("my age is:"+ age);
	 }
}
class demo2
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.name="jyothi";
		p.age=32;
		p.talk();
	}


	}

