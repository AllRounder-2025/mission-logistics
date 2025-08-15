package mission.view;

import java.util.Date;
import mission.service.TimeService;

public class OutputView {
    public static void outputMission(Date eta) {
        System.out.printf("이동 시간은 %f시간 %f분으로 예측됩니다.",
                TimeService.getHours(eta),
                TimeService.getMinutes(eta)
        );
    }
}
