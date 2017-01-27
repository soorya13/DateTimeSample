import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
	public static void main(String[] args)
	{
		String strDate = "2015-08-04";
		LocalDate aLD = LocalDate.parse(strDate);
		System.out.println("Date: " + aLD);

		String strDatewithTime = "2015-08-04 10:11:30";
		 DateTimeFormatter format=DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
		LocalDateTime aLDT = LocalDateTime.parse(strDatewithTime,format);
		System.out.println("Date with Time: " + aLDT);
		
		LocalDateTime curr=LocalDateTime.now();
		String strCurrent=curr.toString();
		System.out.println("Using to String: "+strCurrent);
		
		String strCurrentFormat=curr.format(format);
		System.out.println("Using Format: "+strCurrentFormat);
	}

}
