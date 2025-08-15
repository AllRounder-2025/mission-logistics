package mission.constants;

public enum Text {
    ACQUIRE_FOR_INPUT("출발지를 입력해주세요."),
    ERROR_PLACE_NAME_BLANK("장소의 이름은 비어있을 수 없습니다."),
    ERROR_PLACE_LOCATION_BLANK("장소의 위치는 비어있을 수 없습니다."),
    ERROR_LOCATION_ILLEGAL_DIMENTIONS("장소의 좌표는 2차원이어야 합니다."),
    ERROR_NO_SUCH_INPUT("%s을(를) 이름으로 갖는 장소는 존재하지 않습니다."),
    SUCCESS_OPERATION("이동 시간은 %d시간 %d분으로 예측됩니다.");

    private final String message;

    Text(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
