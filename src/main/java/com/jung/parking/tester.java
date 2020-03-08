package com.jung.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class tester {
    public static void main(String[] args) {
        //java8 new time method,
        // Instance with time zone, need parameter to assign time zone
        //java8time();

        //javatime();

    }

    private static void java8time() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //local date time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime otherdate
                = LocalDateTime.of(2020, 03, 11, 8, 0);
        System.out.println(otherdate);
    }

    private static void javatime() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2020/03/08 08:00:00";
        Date reversedate = null;
        try {
            reversedate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(reversedate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        //MONTH count stars at 0
        calendar.set(Calendar.MONTH, 9);
        calendar.add(Calendar.DAY_OF_YEAR, 3);
    }
}
