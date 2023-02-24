package tolaizerclass;

import java.util.Calendar;

public class calenders {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		int day=c.get(Calendar.DATE);
		int month=c.get(Calendar.MONTH);
		int year=c.get(Calendar.YEAR);
		System.out.println("currentdate:"+day+"-"+month+"-"+year);
		int hour=c.get(Calendar.HOUR);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		System.out.println("curent time:"+hour+":"+minute+":"+second);
		
				
		
		
		
		
		
		
		
		

	}

}
