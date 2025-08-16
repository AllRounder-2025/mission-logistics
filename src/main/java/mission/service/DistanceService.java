package mission.service;

import mission.controller.Position;

public class DistanceService {
    private static final double RADIUS = 6371.0;
    public double getDistance(Position p1, Position p2) {
        double[] from = {
                Math.toRadians(p1.coordinates()[0]),
                Math.toRadians(p1.coordinates()[1])
        };
        double[] to = {
                Math.toRadians(p2.coordinates()[0]),
                Math.toRadians(p2.coordinates()[1])
        };

        double dLat = from[1] - to[1];
        double dLon = from[0] - to[0];

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(from[1]) * Math.cos(to[1]) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return RADIUS * c;
    }
}
