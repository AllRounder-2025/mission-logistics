package mission.controller;

import mission.constants.Text;

public record Position(
        int id,
        double[] coordinates
) {
    public Position {
        if (coordinates.length != 2) {
            throw new IllegalArgumentException(Text.ERROR_LOCATION_ILLEGAL_DIMENTIONS.getMessage());
        }
    }
}
