package mission.view;

import mission.constants.Text;

public class OutputView {
    public static void outputMission(int hours, int minutes) {
        System.out.printf(Text.SUCCESS_OPERATION.getMessage(), hours, minutes);
    }
}
