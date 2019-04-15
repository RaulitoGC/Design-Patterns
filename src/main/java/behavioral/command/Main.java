package behavioral.command;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<ProductName, Command> list = new HashMap<>();
        list.put(ProductName.LIGHT, new TurnOnLightCommand(new Light()));
        list.put(ProductName.TV, new SwitchChannelCommand(new Tv()));
        list.put(ProductName.WINDOWS, new CleanWindowsCommand(new Windows()));

        RemoteControl remoteControl = new RemoteControl(list);
        remoteControl.executeAction(ProductName.LIGHT);
        remoteControl.executeAction(ProductName.TV);
        remoteControl.executeAction(ProductName.WINDOWS);

    }
}
