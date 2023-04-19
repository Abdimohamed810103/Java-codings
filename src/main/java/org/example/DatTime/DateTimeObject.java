package org.example.DatTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeObject {
    public static void main(String[] args) {
        LocalDateTime dateTimeAbdi  = LocalDateTime.now();
        DateTimeFormatter reformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = reformat.format(dateTimeAbdi);
        System.out.println(format1);


        Instant time1 = Instant.now();
        Instant time2 = Instant.now().plus(10, ChronoUnit.MILLIS);

        boolean after = time1.isAfter(time2);
        if (after) {
            System.out.println("time is after ");
        }else {
            System.out.println("No time is before");
        }
    }
}
