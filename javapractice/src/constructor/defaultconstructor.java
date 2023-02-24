package constructor;

class person
{
	String name;
	int id;
	person ()
	{
		id=23;
		name="jyothi";
	}
	void show()
	{
		System.out.println("person id:"+id);
		System.out.println("person name:"+name);
	}
}
class defaultlconstructor
{
	

	public static void main(String[] args) {
		 person p=new person();
		 p.show();
		 person p1=new person();
		 p1.show();
		 
		// TODO Auto-generated method stub

	}

}
