package variables;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingCurrentDate {

	public static void main(String[] args) {
		 // getting current date and time using Date class
		
		 DateFormat df = new SimpleDateFormat("dd_MM_yy-HH:mm");
		 Date dateobj=new Date();
		 System.out.println(df.format(dateobj));
	}
}
