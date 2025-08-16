package mission.dto;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import mission.controller.Location;

public class ParseLocationData implements ParseCsv<Location> {
    @Override
    public List<Location> parse(String csv) {
        List<Location> locations = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    int id = Integer.parseInt(values[0]);
                    double lat = Double.parseDouble(values[1]);
                    double lng = Double.parseDouble(values[2]);
                    locations.add(
                        new Location(id, new double[]{lat, lng})
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return locations;
    }
}