package mission.dto;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import mission.controller.Position;

public class ParsePositionData implements ParseCsv<Position> {
    @Override
    public List<Position> parse(String csv) {
        List<Position> positions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    int id = Integer.parseInt(values[0]);
                    double lat = Double.parseDouble(values[1]);
                    double lng = Double.parseDouble(values[2]);
                    positions.add(
                        new Position(id, new double[]{lat, lng})
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return positions;
    }
}