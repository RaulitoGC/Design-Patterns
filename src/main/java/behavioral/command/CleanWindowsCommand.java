package behavioral.command;

public class CleanWindowsCommand implements Command {

    private final Windows windows;

    public CleanWindowsCommand(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void execute() {
        windows.clean();
    }
}
