package mission.service;

import java.util.Date;

public class TimeService {
    public static long calculateDifference(Date date1, Date date2) {
        return date1.getTime() - date2.getTime();
    }

    public static long getHours(Date date) {
        return date.getTime() / (1000 * 60 * 60);
    }

    public static long getMinutes(Date date) {
        return date.getTime() / (1000 * 60);
    }
}
