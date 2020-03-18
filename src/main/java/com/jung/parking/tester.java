package com.jung.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class tester {
    public static void main(String[] args) {
        //java8 new time method,
        // Instance with time zone, need parameter to assign time zone
        //java8time();
        //javatime();

        LocalDateTime enter
                = LocalDateTime.of(2020, 3, 18, 8, 0, 0);
        LocalDateTime leave
                = LocalDateTime.of(2020, 3, 18, 10, 0, 0);
        CarParking car = new CarParking("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration() / 60f);
        System.out.println("fees are: " + hours * 30 + "dollars");

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
