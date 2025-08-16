package mission.view;

import api.Console;

public abstract class InputView {
    public String input() {
        System.out.println(getMessage());
        System.out.println("> ");
        return Console.readLine();
    }
    protected abstract String getMessage();
}
