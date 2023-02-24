package inheritance;

class student //super class
{
	int id;
	String name;
	int m;
	student(int id, String name, int m)
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
class section extends student
{
	int rno;
	String sname;
	section(int id, String name, int m,int rno,String sname)
	{
		super(id,name,m);
		this.rno=rno;
		this.sname=sname;
	}
	void show()
	{
		display();
		System.out.println("\n roomno:"+ rno +"sectionname:"+sname);
	}
}

public class singleinheritance {

	public static void main(String[] args) 
	{
		section s=new section(23,"jyothi",100,340,"cse");
		s.show();
	}



	}

