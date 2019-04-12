package creational.abstractFatory.platform.mac;

import creational.abstractFatory.platform.AlertDialog;
import creational.abstractFatory.platform.Button;
import creational.abstractFatory.platform.PlatformFactory;

public class MacFactory implements PlatformFactory {
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public AlertDialog getAlertDialog() {
        return new MacAlertDialog();
    }
}
