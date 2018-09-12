import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String strActuallyDate = sc.nextLine();
		//String strExpectedDate = sc.nextLine();
		
		String strActuallyDate = "9 7 2016";
		String strExpectedDate = "6 6 2015";
		strActuallyDate = strActuallyDate.replace(" ", "-");
		strExpectedDate = strExpectedDate.replace(" ", "-");
		SimpleDateFormat dateFormatActually = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat dateFormatExpected = new SimpleDateFormat("dd-MM-yyyy");
		
		dateFormatActually.parse(strActuallyDate);
		Calendar calActually = dateFormatActually.getCalendar();
		
		dateFormatExpected.parse(strExpectedDate);
		Calendar calExpected = dateFormatExpected.getCalendar();
		 
		//int month = cal.	
		int fine = 0;
		
		if(calActually.after(calExpected)) {
			int yearsDiff = calActually.get(Calendar.YEAR) - calExpected.get(Calendar.YEAR);
			if(yearsDiff == 0) {
				int monthsDiff = calActually.get(Calendar.MONTH) - calExpected.get(Calendar.MONTH);
				if(  monthsDiff == 0) {
					int daysDiff = calActually.get(Calendar.DAY_OF_MONTH) - calExpected.get(Calendar.DAY_OF_MONTH);
					if( daysDiff > 0) {
						fine = daysDiff * 15; 
						
					}
				}else {
					fine = monthsDiff * 500;
				}
			}else {
				fine = 10000;
			}
			
		}
		System.out.println(fine);
		
			
	}
}
