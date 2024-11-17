package main.models.utils;

public class DateUtils {
    
}
package utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    public static int calculateDays(LocalDate startDate, LocalDate endDate) {
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }
}
