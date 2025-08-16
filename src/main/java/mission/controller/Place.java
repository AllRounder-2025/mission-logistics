package mission.controller;

import mission.constants.Text;

public record Place(
    int id,
    String name,
    String address
) {
}