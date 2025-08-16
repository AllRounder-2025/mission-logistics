package mission.view.validate;

import mission.constants.Text;
import mission.controller.Place;
import java.util.List;

public class ValidateInput {
    public static void validateBlank(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(Text.ERROR_PLACE_NAME_BLANK.getMessage());
        }
    }

    public static void validatePlaceExists(String PlaceName, List<Place> places) {
        boolean exists = places.stream()
                .anyMatch(place -> PlaceName.equals(place.name()));
        if (!exists) {
            throw new IllegalArgumentException(
                    String.format(Text.ERROR_NO_SUCH_INPUT.getMessage(), PlaceName));
        }
    }

    public static void validateLocationDimensions(double[] coordinates) {
        if (coordinates == null || coordinates.length != 2) {
            throw new IllegalArgumentException(Text.ERROR_LOCATION_ILLEGAL_DIMENTIONS.getMessage());
        }
    }
}
