package mission.controller;

public record Location(
    int id,
    int[] coordinates
) {
    public Location {
        if (coordinates.length != 2) {
            throw new IllegalArgumentException("Location coordinates must be 2-dimensional");
        }
    }
}
