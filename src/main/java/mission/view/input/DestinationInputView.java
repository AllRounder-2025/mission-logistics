package mission.view.input;

import mission.constants.Text;
import mission.view.InputView;

public class DestinationInputView extends InputView {
    @Override
    protected String getMessage() {
        return Text.ACQUIRE_FOR_DESTINATION.getMessage();
    }
}
