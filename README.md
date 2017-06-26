LocalTime time1 = LocalTime.of(6, 15);              //hour and minute
LocalTime time1 = LocalTime.of(6, 15, 30);          //+ seconds
LocalTime time1 = LocalTime.of(6, 15, 30, 200);     //+ nanoseconds

LocalDate date1 = LocalDate.of(2015, Month.January, 20);
LocalDate date1 = LocalDate.of(2015, 1, 20);

LocalDateTime.of(2015, Month.JANARY, 20, 6, 15, 30);

The LocalDate, LocalTime and LocalDateTime classes are immutable.

You MUST make an attempt at common sense when applying the the classes. 

*NOTE* Eclipse public void commonSense();

LocalDateTime Class methods:

LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
date = date.plusDays(2);
date = date.plusWeeks(1);
date = date.plusMonths(1);
date = date.plusYears(5);

Methods can be chained:

LocalDateTime dateTime = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);

Periods: 

Creating the period:

Period annually = Period.ofYears(1);
Period monthly = Period.ofMonths(45);
Period weekly = Period.ofWeeks(2);
Period daily = Period.ofDays(6);

Periods cannot be chained. 

*NOTE* Eclipse public void period();

Formatting Date Time

Can use getters, e.g.
	LocalDate beerDate = LocalDate.of(2017, Month.JUNE, 28);
	System.out.println(date.getDayOfWeek());
	System.out.println(date.getDayOfYear());
	
Or...
	LocalDateTime getDrunkAndKickTheDogDate = LocalDateTime.of(2017, Month.JUNE, 28, 8, 57, 19, 160);
	System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

The Date Time for the above in ISO format is:
	2017-06-28T08:57:19.000000160
	
*NOTE Eclipse public void format():
	
Predefined formats have to be declared ahead of time. E.g.
	DateTimeFormatter short = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

Or.. you can create your own
	DateTimeFormatter f = DatetimeFormatter.ofPattern("MMMM dd, YYY, hh:mm);
	System.out.printLn(getDrunkAndKickTheDogDate.format(f));
	
*NOTE* Eclipse public void parse();
	


