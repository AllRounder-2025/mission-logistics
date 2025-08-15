package mission.dto;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import mission.controller.Location;

abstract class ParseData implements ParseCsv {
    public List<Location> parse(String dir) {
        try (BufferedReader br = new BufferedReader(new FileReader(dir))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(java.util.Arrays.toString(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}