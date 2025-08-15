package mission.controller;

public record Place(
    int id,
    String name,
    String address
) {
    public Place {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Place name cannot be null or blank");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Place address cannot be null or blank");
        }
    }
}