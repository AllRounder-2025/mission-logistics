package mission.view;

import mission.constants.Text;

public class DestinationInputView extends InputView {
    @Override
    protected String getMessage() {
        return Text.ACQUIRE_FOR_DESTINATION.getMessage();
    }
}
