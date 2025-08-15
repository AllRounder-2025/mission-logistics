package mission.controller;

import mission.constants.Text;

public record Place(
    int id,
    String name,
    String address
) {
    public Place {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(Text.ERROR_PLACE_NAME_BLANK.getMessage());
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException(Text.ERROR_PLACE_LOCATION_BLANK.getMessage());
        }
    }
}