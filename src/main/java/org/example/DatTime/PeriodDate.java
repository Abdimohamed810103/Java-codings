package org.example.DatTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PeriodDate {
    public static void main(String[] args) {
        Period p = Period.ofDays(120);
        System.out.println(p.getMonths());
        LocalDateTime localDateTime = LocalDateTime.now();
        Period per = Period.of(localDateTime.getYear(),localDateTime.getMonthValue(),localDateTime.getDayOfMonth());
        System.out.println(per);
        LocalDate localDate = LocalDate.of(2023,04,16);
        LocalDate localDate2 = LocalDate.of(2008,07,15);
        Period pDiff= Period.between(localDate,localDate2);
        System.out.println(pDiff);
        System.out.println(pDiff.plusYears(3));

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
       // System.out.println(availableZoneIds);
        System.out.println(allTimeZoned());
        LocalDateTime local = LocalDateTime.now();
        ZonedDateTime departTimeSweden = local.atZone(ZoneId.of("Europe/Stockholm"));

        ZonedDateTime arriveTime = departTimeSweden.plusHours(12).plusMinutes(30);

        ZonedDateTime timNairobiDepartingFromSweden = departTimeSweden.withZoneSameInstant(ZoneId.of("Africa/Nairobi"));
        ZonedDateTime timNairobiArraival = arriveTime.withZoneSameInstant(ZoneId.of("Africa/Nairobi"));

        System.out.println("DepartingTime " + departTimeSweden + "the time is in nairobi " + timNairobiDepartingFromSweden
        + "Arrival time in nairobi for swedish time " + arriveTime + "time in nairobi for arrival " + timNairobiArraival
        );

        OffsetDateTime utc = departTimeSweden.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        System.out.println(utc);
        OffsetDateTime utc1 = arriveTime.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        System.out.println(utc1);

        long timestamp = 1573768800;
        Date date = new Date(timestamp * 1000);
        Date date1 = new Date(TimeUnit.MILLISECONDS.convert(timestamp, TimeUnit.SECONDS));
        System.out.println(date1);
        System.out.println(date);

        Instant instant = Instant.ofEpochSecond(timestamp);

        System.out.println(instant);

        LocalDate localDate1 = LocalDate.now();
        System.out.println(getDate(localDate1, 15));
    }
   public static LocalDate getDate(LocalDate localDate, int days){
        Period period = Period.ofDays(15);
       TemporalAdjuster t = p->p.minus(period);
       LocalDate with = localDate.with(t);
       return with;
   }
   public static List<String> allTimeZoned(){
        List<String> timeZoned = new ArrayList<>();
       Set<String> zoneIds = ZoneId.getAvailableZoneIds();

       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
       ZonedDateTime zl = ZonedDateTime.now();
       zoneIds.forEach((t)->{
           timeZoned.add(zl.format(dateTimeFormatter) + "zoneId" + t + "time" + zl.withZoneSameInstant(ZoneId.of(t)).format(dateTimeFormatter));
       });
       return timeZoned;
   }

}
