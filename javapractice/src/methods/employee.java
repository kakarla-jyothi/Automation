package methods;

public class employee {
	private int id;
	private String name;
	private double sal;
	 
	
	// mutato methods
	void setId(int id)
	{
		this.id=id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	void setsal(double sal)
	{
		this.sal=sal;
	}
	
	//accessor methods
	int getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}
	double getsal()
	{
		return sal;
	}
	public void setsal(int i, double d) {
		// TODO Auto-generated method stub
		
	}
}
class use
{
	

	public static void main(String[] args) {
		employee e= new employee();
		e.setId(234);
		e.setname("jyothi");
		e.setsal(67,000.123);
		Object getid;
		System.out.println("empid:"+e.getid());
		System.out.println("empid:"+e.getname());
		
		System.out.println("sal ="+e.getsal());
	}
	
		
		
		

	}

