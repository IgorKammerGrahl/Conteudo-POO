package aulaDia21;
import java.time.ZoneId;

public class ExData16 {

	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().forEach((String name) -> {
			System.out.println(name);
		});

	}

}
