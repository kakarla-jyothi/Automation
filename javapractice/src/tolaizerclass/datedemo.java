package tolaizerclass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class datedemo {

	public static void main(String[] args) {
		Date d=new Date();
		DateFormat fmt=DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
		String s= fmt.format(d);
		System.out.println("current date:"+s);
		DateFormat time=DateFormat.getTimeInstance(DateFormat.LONG,Locale.UK);
		String S=time.format(d);
		System.out.println("current time:"+S);
		
		
		
			
				
				
		
		

	}

}
