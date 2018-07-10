import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


class DateUtils {
	public static void main(String[] args) {
		// initialize SimpleDateFormat object
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
		
			Date today = sdf.parse("14/11/2012");
			System.out.println("Date is : " + today.toString());

			

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}