package mission.dto;

import java.util.List;

public interface ParseCsv<T> {
    List<T> parse(String csv);
}