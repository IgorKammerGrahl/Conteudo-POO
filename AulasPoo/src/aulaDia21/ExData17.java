package aulaDia21;
import java.time.LocalDate;

public class ExData17 {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.parse("1978-04-24");
		
		LocalDate dt1 = dt.minusDays(1);
		System.out.println(dt1);
		
		dt1 = dt.minusMonths(10);
		System.out.println(dt1);
		
		dt1 = dt.plusWeeks(2);
		System.out.println(dt1);
		
		dt1 = dt.plusYears(45);
		System.out.println(dt1);

	}

}
