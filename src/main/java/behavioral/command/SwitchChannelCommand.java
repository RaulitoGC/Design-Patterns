package behavioral.command;

public class SwitchChannelCommand implements Command {

    private final Tv tv;

    public SwitchChannelCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.switchChannel();
    }
}
