package aulaDia21;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExData14 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.parse("1978-04-24T13:27:47");
		DateTimeFormatter dtfDataHoraBrasil = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(dt.format(dtfDataHoraBrasil));

	}

}
