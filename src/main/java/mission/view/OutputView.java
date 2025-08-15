package mission.view;

import java.util.Date;

import mission.constants.Text;
import mission.service.TimeService;

public class OutputView {
    public static void outputMission(Date eta) {
        System.out.printf(Text.SUCCESS_OPERATION.getMessage(),
                TimeService.getHours(eta),
                TimeService.getMinutes(eta)
        );
    }
}
