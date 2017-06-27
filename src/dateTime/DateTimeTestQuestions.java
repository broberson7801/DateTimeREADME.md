package dateTime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTimeTestQuestions {

	public static void main(String[] args) {
		DateTimeTestQuestions questions = new DateTimeTestQuestions();

		questions.commonSense();
		questions.period();
		questions.format();
		questions.parse();
		questions.dateTimeAndPeriodTogether(2);
		questions.duration();
		questions.timeZoneOffset();

	}

	public void commonSense() {

		// Will the following code compile and/or run?
		// LocalDateTime dateTime = new LocalDateTime();

		// What is the output of the following code?
		// LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		// date.plusDays(10);
		// System.out.println(date);

		// What is wrong with the code below, if anything?
		// LocalDate theDate = LocalDate.of(2020, Month.JANUARY, 20);
		// theDate = theDate.plusMinutes(1);
		// System.out.println(theDate);

		// What is the result of the following code?
		// System.out.println(LocalDate.of(2015, Month.JANUARY, 6_908_977));

	}

	public void period() {
		// What is the output of the following code?
		// Period thePeriod = Period.ofYears(1).ofWeeks(3).ofDays(9);
		// System.out.println(thePeriod);

	}

	public void format() {
		// LocalDateTime getDrunkAndKickTheDogDate = LocalDateTime.of(2017,
		// Month.JUNE, 28, 8, 57, 19, 160);
		// System.out.println(getDrunkAndKickTheDogDate);
		//
		// DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, YY,
		// hh:mm");
		// System.out.println(getDrunkAndKickTheDogDate.format(f));

		// What will Print?
		// System.out.println(f);
	}

	public void parse() {
		// DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		// LocalDate date = LocalDate.parse("01 02 2015", f);
		// LocalTime time = LocalTime.parse("11:22");
		// System.out.println(date);
		// System.out.println(time);
	}

	public void dateTimeAndPeriodTogether(int numDays) {
		// LocalDate date = LocalDate.now();
		// Period days = Period.ofDays(numDays);
		// Period months = Period.ofMonths(2);
		// System.out.println(date.plus(days));
		// System.out.println(date.minus(months));

	}

	public void duration() {

		// Duration timeUntilWifeComesHome;
		//
		// LocalDateTime partyTime = LocalDateTime.of(2017, Month.JUNE, 28, 21,
		// 30, 40, 490);
		// LocalDateTime partyOver = LocalDateTime.of(2017, Month.JUNE, 29, 02,
		// 30, 25, 190);
		//
		// timeUntilWifeComesHome = Duration.between(partyOver, partyTime);
		// System.out.println(timeUntilWifeComesHome);
	}

	public void timeZoneOffset() {
		// LocalDateTime now = LocalDateTime.now();
		// ZoneOffset offset = ZoneOffset.ofHours(3);
		// OffsetDateTime today = OffsetDateTime.of(now, offset);
		// System.out.println(today);
		//
		// DateTimeFormatter dateFormatter =
		// DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//
		// This will get you the date out of the date/time
		// String nowString = now.format(dateFormatter);
		// System.out.println("Now date: " + nowString);
		//
		//
		// This will get you the time out of date/time
		// DateTimeFormatter timeFormatter =
		// DateTimeFormatter.ofPattern("HH:mm:ss");
		// String timeString = now.format(timeFormatter);
		// System.out.println("Now time: " + timeString);

	}

}
