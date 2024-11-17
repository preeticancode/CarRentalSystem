package main.utils;

public class DateUtils {
    
}
package main.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    public static int calculateDays(LocalDate startDate, LocalDate endDate) {
        return (int) ChronoUnit.DAYS.between(startDate, endDate);
    }
}
