package mission.view;

import mission.constants.Text;

public class DepartureInputView extends InputView {
    @Override
    protected String getMessage() {
        return Text.ACQUIRE_FOR_DEPARTURE.getMessage();
    }
}