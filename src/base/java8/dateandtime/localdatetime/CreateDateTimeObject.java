package base.java8.dateandtime.localdatetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

public class CreateDateTimeObject {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now(
        );     // The current date and time
        LocalDate oldDate = LocalDate.of(2012, Month.DECEMBER, 12); // from values
        LocalDate.ofEpochDay(150);  // middle of 1970
        LocalTime.of(17, 18); // the train I took home today
        LocalTime.parse("10:15:30"); // From a String

        LocalDate theDate = timePoint.toLocalDate();
        Month month = timePoint.getMonth();
        int day = timePoint.getDayOfMonth();
        timePoint.getSecond();

        System.out.println(theDate);
        System.out.println(month);
        System.out.println(day);

        // Set the value, returning a new object
        LocalDateTime thePast = timePoint.withDayOfMonth(
                10).withYear(2010);

        System.out.println(thePast);

        /* You can use direct manipulation methods,
        or pass a value and field pair */
        LocalDateTime yetAnother = thePast.plusWeeks(
                3).plus(3, ChronoUnit.WEEKS);

        System.out.println(yetAnother);

        LocalTime time = LocalTime.now();
        LocalTime truncatedTime = time.truncatedTo(ChronoUnit.SECONDS);

        System.out.println(truncatedTime);

        // You can specify the zone id when creating a zoned date time
        ZoneId id = ZoneId.of("Europe/Paris");
        ZonedDateTime zoned = ZonedDateTime.of(timePoint, id);
        assertEquals(id, ZoneId.from(zoned));

        ZoneOffset offset = ZoneOffset.of("+02:00");

        ZonedDateTime oldDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");

        OffsetTime offsetTime = OffsetTime.now();
        // changes offset, while keeping the same point on the timeline
        OffsetTime sameTimeDifferentOffset = offsetTime.withOffsetSameInstant(offset);
        // changes the offset, and updates the point on the timeline
        OffsetTime changeTimeWithNewOffset = offsetTime.withOffsetSameLocal(offset);
        // Can also create new object with altered fields as before
        changeTimeWithNewOffset.withHour(3).plusSeconds(2);

        System.out.println(sameTimeDifferentOffset);
        System.out.println(changeTimeWithNewOffset);

        // 3 years, 2 months, 1 day
        Period period = Period.of(3, 2, 1);

        // You can modify the values of dates using periods
        LocalDate newDate = oldDate.plus(period);
        ZonedDateTime newDateTime = oldDateTime.minus(period);
        // Components of a Period are represented by ChronoUnit values
        assertEquals(1, period.get(ChronoUnit.DAYS));

        System.out.println(newDate);
        System.out.println(newDateTime);

        // A duration of 3 seconds and 5 nanoseconds
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        Duration duration = Duration.ofSeconds(3, 5);
        Duration oneDay = Duration.between(today, yesterday);

        System.out.println(duration);
        System.out.println(oneDay);
    }
}
