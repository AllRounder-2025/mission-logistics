package mission.service;

public class TimeService {
    private static final double DEFAULT_SPEED_KMH = 60.0;

    public static double predictTravelTimeHours(double distanceKm) {
        return distanceKm / DEFAULT_SPEED_KMH;
    }
}