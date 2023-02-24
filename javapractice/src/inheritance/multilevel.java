package inheritance;

class students

{
	int id;
	String name;
	int m;
	students(int id, String name, int m)
	{
		
		this.id=id;
		this.name=name;
		this.m=m;
	}
	void display()
	{
	System.out.println("id:"+id+"\nname:"+name+"\nmarks:"+m);
	}
}
class sports extends students
{
	int spm, tot;
	String sname;
	sports(int id, String name, int m, int spm, String sname)
	{
		super(id,name,m);
		this.tot=m;
		this.spm=spm;
		this.sname=sname;
	}
	

	void show()
	{
		display();
		System.out.println("\sports name:"+sname+"\nsportsmarks:"+spm);
	}
	int result()
	{
		return tot+spm;
	}
}
class result extends sports
{
	int p;
	result()
	{
		super(4567,"jyothi",100,89,"shuttle");
		p=super.result();
		super.show();
		System.out.println("totla marks:"+p);
	}
}
class multilevil
{

	public static void main(String[] args) {
		result r= new result();
	}
}


	
