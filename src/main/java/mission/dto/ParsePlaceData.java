package mission.dto;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import mission.controller.Place;

public class ParsePlaceData implements ParseCsv<Place> {
    @Override
    public List<Place> parse(String csv) {
        List<Place> places = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                if (values.length == 3) {
                    int id = Integer.parseInt(values[0]);
                    String name = values[1];
                    String address = values[2];
                    places.add(new Place(id, name, address));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return places;
    }
}