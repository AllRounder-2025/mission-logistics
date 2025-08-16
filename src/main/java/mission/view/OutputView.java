package mission.view;

import mission.constants.Text;

public class OutputView {
    public static void outputMission(double time) {
        int hours = (int) time;
        int minutes = (int) Math.round((time - hours) * 60);
        System.out.printf(Text.SUCCESS_OPERATION.getMessage(), hours, minutes);
    }
}
