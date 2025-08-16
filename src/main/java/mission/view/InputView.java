package mission.view;

import mission.constants.Text;

public class InputView {
    public static String inputMission() {
        System.out.println(Text.ACQUIRE_FOR_INPUT.getMessage());
        System.out.println("> ");
        String input;
        try {
            input = System.console().readLine();
        } catch (Exception e) {
            input = "";
        }
        return input;
    }
}
