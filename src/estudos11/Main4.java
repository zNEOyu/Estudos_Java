package estudos11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main4 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastW = d04.minusDays(7);
		LocalDate nextW = d04.plusDays(7);
		
		System.out.println("past: " + pastW);
		System.out.println("next: " + nextW);
	}

}
