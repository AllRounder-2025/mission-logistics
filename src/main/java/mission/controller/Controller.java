package mission.controller;

import mission.view.input.*;
import mission.view.OutputView;
import mission.view.validate.ValidateInput;
import mission.dto.ParsePlaceData;
import mission.dto.ParsePositionData;
import mission.service.DistanceService;
import mission.service.TimeService;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Controller {
    public static void run() {
        List<Place> places = new ParsePlaceData().parse("src/main/resources/place.csv");
        List<Position> positions = new ParsePositionData().parse("src/main/resources/position.csv");
        
        Map<String, Place> placeMap = new HashMap<>();
        Map<Integer, Position> positionMap = new HashMap<>();
        
        for (Place place : places) {
            placeMap.put(place.name(), place);
        }
        
        for (Position position : positions) {
            positionMap.put(position.id(), position);
        }
        
        String from = new DepartureInputView().input();
        ValidateInput.validateBlank(from);
        ValidateInput.validatePlaceExists(from, places);
        
        String to = new DestinationInputView().input();
        ValidateInput.validateBlank(to);
        ValidateInput.validatePlaceExists(to, places);
        
        Place fromPlace = placeMap.get(from);
        Place toPlace = placeMap.get(to);
        
        Position fromPosition = positionMap.get(fromPlace.id());
        Position toPosition = positionMap.get(toPlace.id());
        
        if (fromPosition == null || toPosition == null) {
            System.out.println("위치 정보를 찾을 수 없습니다.");
            return;
        }
        
        ValidateInput.validatePositionDimensions(fromPosition.coordinates());
        ValidateInput.validatePositionDimensions(toPosition.coordinates());
        
        DistanceService distanceService = new DistanceService();
        double distance = distanceService.getDistance(fromPosition, toPosition);
        double travelTime = TimeService.predictTravelTimeHours(distance);
        
        int hours = (int) travelTime;
        int minutes = (int) Math.round((travelTime - hours) * 60);
        
        OutputView.outputMission(hours, minutes);
    }
}
