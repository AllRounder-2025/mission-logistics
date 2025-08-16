package mission.controller;

import mission.constants.Text;

public record Location(
        int id,
        double[] coordinates
) {
    public Location {
        if (coordinates.length != 2) {
            throw new IllegalArgumentException(Text.ERROR_LOCATION_ILLEGAL_DIMENTIONS.getMessage());
        }
    }
}
