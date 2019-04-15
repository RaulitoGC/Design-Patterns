package behavioral.command;

import java.util.HashMap;

public class RemoteControl {

    private final HashMap<ProductName, Command> list;

    public RemoteControl(HashMap<ProductName, Command> list) {
        this.list = list;
    }

    public void executeAction(ProductName productName) {
        if (list.containsKey(productName)) {
            this.list.get(productName).execute();
        }
    }
}
