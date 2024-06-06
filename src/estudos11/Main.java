package estudos11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		Instant d03 = Instant.now();
		System.out.println(d03);
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26Z");
		System.out.println(d05);
		Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d06);
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09);
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		System.out.println(d10);
		
	}

}
